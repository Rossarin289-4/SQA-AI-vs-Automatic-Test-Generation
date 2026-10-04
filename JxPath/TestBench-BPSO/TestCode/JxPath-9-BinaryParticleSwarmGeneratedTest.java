package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<empty>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:6>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:6>", "<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:3>", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<i:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:b>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:4>", "<s:b]>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:6>", "<s:C>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:8>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:11>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:1>", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:2>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:<>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:6>", "<s:{>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:6>", "<sample:4>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<i:0>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:>", "<d:-0.75>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:m>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:9b>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<i:2>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<s:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:4>", "<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<sample:1>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<empty>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<b:true>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<null>", "<sample:7>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:1>", "<s:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:2>", "<i:40>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<i:-58>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:9>", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:9>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<d:0.375>", "<s:kfy>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<d:1.44>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<s:1[>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-0.75>", "<s:k;dy>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:9>", "<sample:5>", "<sample:6>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:1>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:0>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<d:0.75>", "<s:2a\t>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:9>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<b:true>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:8>", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:6>", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:6>", "<sample:1>", "<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<s:ey>", "<d:-12.5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<s:mC>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:9>", "<i:-1>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:>", "<b:false>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<b:false>", "<d:-1.85>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<i:-1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s::a>", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:2>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
