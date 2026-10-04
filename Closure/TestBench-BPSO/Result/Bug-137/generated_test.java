package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isForIn", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLoopStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssign", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getConditionExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"01s", "-2", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 01s {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=01s, getString=01s, getType=38, hasChildren=false, hasMoreThanOneChild=false, hasOneCh...#348#-1570717876", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVar", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "referencesThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPreOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:5>", "<sample:6>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"13"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=130, hasChildren=true, hasM...#378#-755987101", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isReferenceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isConstantName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getNameReferenceCount", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "undffine"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssociative", new String[]{"int"}, new String[]{"-524290"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectApply", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "copyNameAnnotations", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypePropertyName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLabelName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getLoopCodeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "hasCatchHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isPrototypePropertyDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "hasFinally", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getOpFromAssignmentOp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGet", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLiteralValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{"applyb", "<empty>", "<sample:12>", "-4", "10"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.FunctionNode", actual.getClass().getName());
  assertEquals("FUNCTION applyb {getBaseLineno=-1, getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getEncodedSourceEnd=0, getEncodedSourceStart=0, getEndLineno=-1, getFunctionCount=0, getFunc...#366#958085059", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.5e300", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=118, hasChildren=true, hasMoreThanO...#370#1654786893", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newUndefinedNode", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VOID {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=122, hasChildren=true, hasMoreThan...#372#558254686", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"cCll", "<sample:7>", "applyNaN"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME cCll 7 [originalname: applyNaN] {getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=cCll, getString=cCll, getType=38, hasChildren=false, hasMore...#376#-368572445", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getCatchBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "removeChild", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "constructorCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isEmptyBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "tryMergeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getSourceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isHoistedFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isString", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLhs", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:8>", "524290", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "redeclareVarsInsideBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:4>", "<sample:5>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExpressionNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExprCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isString", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectLitKey", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "1.5d"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAnonymousFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypeClassName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSimpleFunctionObjectCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isControlStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"1.123;45678901293456", "<sample:10>", "NHello, World"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GETPROP [originalname: NHello, World] {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=1.123;45678901293456, getString=!UnsupportedOperationExce...#419#-390902666", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getInfoForNameNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFnParameters", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isPrototypeProperty", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234565890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectLitKey", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>"}, true), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getStringValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getNodeTypeReferenceCount", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsTypeInOuterScope", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "11"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNew", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"22"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"callI", "<null>"}, true), new String[][]{{"getChildAtIndex", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:7>", "<sample:4>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "canBeSideEffected", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"Math"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssociative", new String[]{"int"}, new String[]{"9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidDefineValue", new String[]{"com.google.javascript.rhino.Node", "java.util.Set"}, new String[]{"<sample:12>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidDefineValue", new String[]{"com.google.javascript.rhino.Node", "java.util.Set"}, new String[]{"<sample:13>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isValidPropertyName", new String[]{"java.lang.String"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"1.5dHello, World1.25", "<null>", "1.p5e300"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"22"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"26"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"52"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("===", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("^", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"52"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("instanceof", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"90"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("|", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"90"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">>>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"18"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"98"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLabelName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"94"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getInfoForNameNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"24"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"51"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("in", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"14"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:17>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("%", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLiteralValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:17>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"27"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"89"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"32"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("typeof", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"46"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectLitKey", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:17>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFunctionBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionAnonymous", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getFunctionBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsTypeInOuterScope", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:8>", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:12>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectApply", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newExpr", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "constructorCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{" of ", "<null>", ""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isPrototypePropertyDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Expected NEW node,!g", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME Expected NEW node,!g 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=Expected NEW node,!g, getString=Expected NEW node,!g, getType=38, has...#399#-335370136", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isEmptyBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionAnonymous", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"_", "<sample:8>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME _ [originalname: true] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=_, getString=_, getType=38, hasChildren=false, hasMoreThanOneChild=...#363#-1693564457", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSwitchCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExprAssign", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExprAssign", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getAssignedValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVar", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:14>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectCallMethod", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLiteralValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getAssignedValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"4"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getPrototypePropertyName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getAssignedValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getAssignedValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isHoistedFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionObjectApply", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:8>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "setDebugInformation", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:4>", "<sample:8>", "1E-5"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "tryMergeBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{"1.12346678901234567", "<sample:0>", "<sample:2>", "10", "1879048191"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatementBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isEmptyBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isReferenceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.common.base.Predicate"}, new String[]{"<sample:8>", "apply", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSimpleFunctionObjectCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "has", new String[]{"com.google.javascript.rhino.Node", "com.google.common.base.Predicate", "com.google.common.base.Predicate"}, new String[]{"<sample:1>", "<sample:3>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.12345678901234567", "<sample:11>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=118, hasChildren=true, hasMoreThanO...#370#1654786893", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:13>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAnonymousFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "functionCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567890123456", "<sample:5>"}, true, 0, null, 2), new String[][]{{"isOptionalArg", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:9>", "262145", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isForIn", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isReferenceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:2>", "-524290", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isImmutableValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "precedence", new String[]{"int"}, new String[]{"-58"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLhs", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isString", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isTryFinallyNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatementBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getAssignedValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "canBeSideEffected", new String[]{"com.google.javascript.rhino.Node", "java.util.Set"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSimpleOperatorType", new String[]{"int"}, new String[]{"-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssign", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLiteralValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "removeChild", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStrNoFail", new String[]{"int"}, new String[]{"2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isGetProp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "canBeSideEffected", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "copyNameAnnotations", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:10>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:1>", "<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:4>", "-67371009", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isSwitchCase", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isVarArgsFunction", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "redeclareVarsInsideBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExprAssign", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getBooleanValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPostOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:7>", "<sample:2>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isImmutableValue", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "copyNameAnnotations", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isAssignmentOp", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "referencesThis", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"PT11H", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME PT11H 0 {getCharno=4095, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=PT11H, getString=PT11H, getType=38, hasChildren=false, hasMoreThanOneChild=false,...#357#1518900346", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isReferenceName", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "-16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:11>", "-502", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"1", "<sample:12>", "1.12345678901234567I"}, true), new String[][]{{"hasMoreThanOneChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "visitPreOrder", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeUtil$Visitor", "com.google.common.base.Predicate"}, new String[]{"<sample:7>", "<sample:9>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{")$", "<null>", "<sample:1>", "0", "-1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isFunctionDeclaration", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNodeTypeReferenced", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:9>", "-2147483648", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"NoB an assiment op", "<sample:8>", "|"}, true), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"TITKE", "<sample:12>", "PT1Hundeefined"}, true), new String[][]{{"cloneNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME TITKE [originalname: PT1Hundeefined] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=TITKE, getString=TITKE, getType=38, hasChildren=false...#385#-832884367", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "setDebugInformation", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "1.5d010"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.12346678", "<sample:5>"}, true), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsTypeInOuterScope", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "524290"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<null>", "-4", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isStatement", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"0xFFFFFFFF", "<null>", "arguments"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLhs", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isObjectCallMethod", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:12>", "214748e648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getConditionExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isLoopStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, true), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.1234678911234567", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 1.1234678911234567 {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=1.1234678911234567, getString=1.1234678911234567, getType=38, hasChildr...#393#-1407102236", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true), new String[][]{{"clear", "", "0"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"Jnfinity", "-4", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME Jnfinity {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=Jnfinity, getString=Jnfinity, getType=38, hasChildren=false, hasMoreThanOneChild=...#363#1581297165", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "has", new String[]{"com.google.javascript.rhino.Node", "com.google.common.base.Predicate", "com.google.common.base.Predicate"}, new String[]{"<sample:11>", "<sample:0>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"of ", "<sample:11>", "0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME of  32 [originalname: 0x123456789] {getCharno=64, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=32, getQualifiedName=of , getString=of , getType=38, hasChildren=false, hasM...#379#1544295462", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, true), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"N<aN", "<sample:11>", "0x123455789"}, true), new String[][]{{"isSyntheticBlock", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>"}, true), new String[][]{{"enterScope", "com.google.javascript.jscomp.NodeTraversal", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getVarsDeclaredInBranch", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "setDebugInformation", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:9>", "<null>", "||-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Infinit", "<sample:4>"}, true), new String[][]{{"getJSType", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "int", "int"}, new String[]{"", "-2147483648", "-2147483648"}, true), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=, getString=, getType=38, hasChildren=false, hasMoreThanOneChild=false, hasOneChild=false...#339#-950092456", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newVarNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"12:30:55", "<sample:9>"}, true), new String[][]{{"putIntProp", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR [target: 2147483647] {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=118, hasChildr...#391#-1796615652", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"+1", "<sample:4>", "applyNaN.6"}, true), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME +1 [originalname: applyNaN.6] {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=+1, getString=+1, getType=38, hasChildren=true, hasMoreThanO...#370#-1749153806", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isExprCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getNameReferenceCount", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "$$$"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "getCatchBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "constructorCallHasSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "opToStr", new String[]{"int"}, new String[]{"939524095"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.common.base.Predicate"}, new String[]{"<sample:13>", "2147483647", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "isNameReferenced", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:7>", "||"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"NHello, World", "<sample:7>", "cCl"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME NHello, World 7 [originalname: cCl] {getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=NHello, World, getString=NHello, World, getType=38, hasC...#398#-1490896014", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"1e1k0", "<sample:10>", "Matth"}, true), new String[][]{{"cloneTree", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME 1e1k0 [originalname: Matth] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=1e1k0, getString=1e1k0, getType=38, hasChildren=false, hasMore...#376#-743454", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newFunctionNode", new String[]{"java.lang.String", "java.util.List", "com.google.javascript.rhino.Node", "int", "int"}, new String[]{";1I", "<sample:4>", "<sample:8>", "536870922", "-1048580"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "containsType", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newName", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"-$1m", "<sample:4>", "StrhngExpected NEW node, got "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME -$1m [originalname: StrhngExpected NEW node, got ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=-$1m, getString=-$1m, getType=38, hasCh...#397#1127656841", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil", "newQualifiedNameNode", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"Expected CALL nodf, got ", "<sample:2>", " (typf "}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME Expected CALL nodf, got  0 [originalname:  (typf ] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=Expected CALL nodf, got , getString=Expec...#435#-2144315460", SearchInputFactory_scaffolding.observe(actual));
 }
}
