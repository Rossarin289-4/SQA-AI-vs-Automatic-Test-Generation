package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypeClassName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isPrototypeProperty", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectApply", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "canBeSideEffected", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLabelName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isControlStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("^", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLiteralValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFnParameters", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=130, hasChildren=true, hasM...#378#-755987101", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isReferenceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "tryMergeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypePropertyName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNew", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExprCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"arguments", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME arguments 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=arguments, getString=arguments, getType=38, hasChildren=false, hasMoreThanOne...#369#-1423707832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isString", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"$$"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"$$Expected NEW node, got "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isEmptyBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGet", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getLoopCodeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "constructorCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{" of ", "<empty>", "<sample:3>", "2", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.FunctionNode", actual.getClass().getName());
  assertEquals("FUNCTION  of  {getBaseLineno=-1, getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getEncodedSourceEnd=0, getEncodedSourceStart=0, getEndLineno=-1, getFunctionCount=0, getFuncti...#362#-1358405159", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getSourceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "redeclareVarsInsideBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLoopStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:3>", "1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getOpFromAssignmentOp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLabelName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLhs", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=118, hasChildren=true, hasMoreThanO...#370#1654786893", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isPrototypePropertyDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:2>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isConstantName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"unddfined", "<sample:3>", "null"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME unddfined [originalname: null] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=unddfined, getString=unddfined, getType=38, hasChildren=fal...#387#1424548140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getConditionExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "hasCatchHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectLitKey", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPreOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVar", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getCatchBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExpressionNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "referencesThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isImmutableValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsTypeInOuterScope", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:3>", "32"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "copyNameAnnotations", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"38"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getNameReferenceCount", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", " of "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isHoistedFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssociative", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isForIn", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"abc", "<null>"}, true, 0, null, 2), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSimpleFunctionObjectCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssign", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isString", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "removeChild", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "hasFinally", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getInfoForNameNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getInfoForNameNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAnonymousFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"19"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>"}, true), new String[][]{{"enterScope", "com.google.javascript.jscomp.NodeTraversal", "6"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}, {"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newUndefinedNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VOID {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=122, hasChildren=true, hasMoreThan...#372#558254686", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidDefineValue", new String[]{"com.google.javascript.rhino.Node", "java.util.Set"}, new String[]{"<sample:4>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"..5", "<sample:1>", ")"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GETPROP [originalname: )] {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=..5, getString=!UnsupportedOperationException, getType=33, hasChildre...#390#-781865797", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidDefineValue", new String[]{"com.google.javascript.rhino.Node", "java.util.Set"}, new String[]{"<sample:11>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getNodeTypeReferenceCount", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:9>", "<sample:1>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"19"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectLitKey", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssociative", new String[]{"int"}, new String[]{"23"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"46"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"86"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"29"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"22"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"24"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"46"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"86"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"22"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("typeof", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"52"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("instanceof", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypeClassName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarArgsFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=130, hasChildren=true, hasM...#378#-389632670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"isQualifiedName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getExistingIntProp", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getQualifiedName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"argum", "0", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME argum 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=argum, getString=argum, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-1950409296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"argtm", "0", "2147483618"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME argtm 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=argtm, getString=argtm, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-1610080433", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"ar4tm", "0", "2147483618"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME ar4tm 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=ar4tm, getString=ar4tm, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-421060030", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"ar4tm", "1", "2147483618"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME ar4tm 1 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=ar4tm, getString=ar4tm, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#468991360", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"ar4tm", "25", "2147483613"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME ar4tm 25 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=25, getQualifiedName=ar4tm, getString=ar4tm, getType=38, hasChildren=false, hasMoreThanOneChild=fals...#359#830835072", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"ar4tm", "-2147483648", "2147483613"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME ar4tm {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=ar4tm, getString=ar4tm, getType=38, hasChildren=false, hasMoreThanOneChild=false, ha...#354#-602136042", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.common.base.Predicate"}, new String[]{"<sample:5>", " ", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.common.base.Predicate"}, new String[]{"<sample:4>", "-1", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "setDebugInformation", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "<sample:6>", "-.0"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGet", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLatin", new String[]{"java.lang.String"}, new String[]{"gioiy+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLatin", new String[]{"java.lang.String"}, new String[]{"|"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSwitchCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSwitchCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{" of ", "<sample:2>", "<sample:3>", "2", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{" of ", "<empty>", "<sample:6>", "2", "-2147483648"}, true, 0, null, 2), new String[][]{{"getFunctionCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{" of ", "<empty>", "<sample:6>", "2", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.FunctionNode", actual.getClass().getName());
  assertEquals("FUNCTION  of  2 {getBaseLineno=-1, getCharno=4095, getChildCount=3, getDouble=!UnsupportedOperationException, getEncodedSourceEnd=0, getEncodedSourceStart=0, getEndLineno=-1, getFunctionCount=0, getFu...#365#-2131336441", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getSourceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getSourceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "90"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLoopStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:3>", "1", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"<null>", "-2147483648", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:0>", "0", "<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLabelName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLhs", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGetProp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "redeclareVarsInsideBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "redeclareVarsInsideBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:2>", "<sample:6>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"unddfined", "<sample:2>", "tlk"}, true, 0, null, 1), new String[][]{{"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME unddfined 0 [label_id_prop: 2] [originalname: tlk] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=unddfined, getString=unddfined, getType=3...#405#-986894588", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPreOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:2>", "<sample:6>", "<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "tryMergeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:3>", "0", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypePropertyName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"Infimvity.1NaN", "<sample:4>", "8:"}, true, 0, null, 2), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "2"}, {"getChildBefore", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"abc", "<null>", ""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSimpleOperatorType", new String[]{"int"}, new String[]{"-2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:0>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getCatchBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"0<EFFFFFEF", "0", "10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 0<EFFFFFEF 0 {getCharno=10, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=0<EFFFFFEF, getString=0<EFFFFFEF, getType=38, hasChildren=false, hasMoreThanOn...#370#2139564175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{"1.12345678", "<sample:5>", "<null>", "-268435455", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{"1.12345678", "<sample:5>", "<null>", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "canBeSideEffected", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isControlStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypeClassName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<null>", "<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLiteralValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectCallMethod", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "|"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionAnonymous", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true), new String[][]{{"getChildAtIndex", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "tryMergeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarArgsFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarArgsFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, true), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:1>"}, true), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}, {"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getExistingIntProp", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"isSyntheticBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getChildBefore", "com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getQualifiedName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"(rguments", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME (rguments 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=(rguments, getString=(rguments, getType=38, hasChildren=false, hasMoreThanOne...#369#1814496641", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"argum", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME argum 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=argum, getString=argum, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-1950409296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isString", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.common.base.Predicate"}, new String[]{"<null>", " ", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.common.base.Predicate"}, new String[]{"<sample:5>", " ", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.common.base.Predicate"}, new String[]{"<sample:5>", " ", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"010", "-2147483648", "-1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 010 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=010, getString=010, getType=38, hasChildren=false, hasMoreThanOneChild=false, hasOneCh...#348#-432323351", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"String", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME String {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=String, getString=String, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-1531331285", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Stri\rg", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME Stri\rg {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=Stri\rg, getString=Stri\rg, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-792351122", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Stri\rg", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Stri\rg", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME Stri\rg 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=Stri\rg, getString=Stri\rg, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#2143380422", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Stri\rg", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME Stri\rg 7 {getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=Stri\rg, getString=Stri\rg, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#-1561239458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isEmptyBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "setDebugInformation", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "TITLE"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGet", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLatin", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSwitchCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSwitchCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "s04"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFunctionName", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:3>", "1", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:5>", "-1", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFunctionBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"undefined", "<sample:4>", "1.25"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME undefined [originalname: 1.25] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=undefined, getString=undefined, getType=38, hasChildren=fal...#387#-2026792236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"undefined", "<sample:2>", "1.25true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME undefined 0 [originalname: 1.25true] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=undefined, getString=undefined, getType=38, hasChildren...#391#-1197466434", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"undef", "<sample:2>", "1.25true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME undef 0 [originalname: 1.25true] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=undef, getString=undef, getType=38, hasChildren=false, hasM...#379#1848278466", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"undef", "<sample:2>", "1.25true"}, true), new String[][]{{"getBooleanProp", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssignmentOp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLhs", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a", "<sample:13>"}, true), new String[][]{{"getParent", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Expebted NEW (type ", "<sample:5>"}, true), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGetProp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGetProp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:2>", "<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:7>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFunctionBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "<null>", "null"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"unddfined", "<sample:2>", "dull"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME unddfined 0 [originalname: dull] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=unddfined, getString=unddfined, getType=38, hasChildren=fal...#387#-1196211430", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"unddfined", "<null>", "ulk"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isControlStructureCodeBlock", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFunctionName", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"Expected CALL node, got ", "<null>", "Math"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"Expected CALL node, gott ", "<sample:4>", ":a4t"}, true), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "2"}, {"getChildBefore", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"Infinvity.1", "<sample:2>", ":a4t"}, true), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "2"}, {"getChildBefore", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSimpleOperatorType", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"PT1H", "<sample:1>", "a"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME PT1H [originalname: a] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=PT1H, getString=PT1H, getType=38, hasChildren=false, hasMoreThanOne...#369#839662178", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"0xFFFFFFFF", "0", "10"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 0xFFFFFFFF 0 {getCharno=10, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=0xFFFFFFFF, getString=0xFFFFFFFF, getType=38, hasChildren=false, hasMoreThanOn...#370#499387401", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"0<EFFFFFFF", "0", "10"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 0<EFFFFFFF 0 {getCharno=10, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=0<EFFFFFFF, getString=0<EFFFFFFF, getType=38, hasChildren=false, hasMoreThanOn...#370#-372279026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"0<EFFFFFEF", "0", "10"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 0<EFFFFFEF 0 {getCharno=10, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=0<EFFFFFEF, getString=0<EFFFFFEF, getType=38, hasChildren=false, hasMoreThanOn...#370#2139564175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{" ", "<empty>", "<null>", "-1", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{"o ", "<sample:3>", "<null>", "-268435455", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "referencesThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVar", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"0", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 0 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=0, getString=0, getType=38, hasChildren=false, hasMoreThanOneChild=false, hasOneChild=fa...#342#71317354", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isImmutableValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
