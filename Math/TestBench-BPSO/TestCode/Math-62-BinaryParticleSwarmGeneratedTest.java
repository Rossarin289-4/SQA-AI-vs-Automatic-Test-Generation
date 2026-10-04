package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:0>", "NaN", "-8.988465674311579E307"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "0.49999999999999994", "Infinity", "1.7976931348623157E308"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<null>", "0.5", "0.5", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "0.5", "0.6599999999999999", "-8.988465674311579E307"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "4.9E-324", "-2.9000000000000004"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:1>", "-1.7976931348623157E308", "-Infinity", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getPoint", "", "5"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:0>", "-1.0", "-4.9E-324"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<null>", "Infinity", "-8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:3>", "-Infinity", "0.24999999999999997"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<null>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "-Infinity", "NaN"}, false, 5, new String[][]{}), new String[][]{{"getPoint", "", "5"}, {"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:3>", "4.999999999999999", "0.5000000000000001"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-63"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-63, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-86"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "-8.988465674311579E307", "-8.988465674311579E307", "-8.98846567431158E307"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:8>", "-Infinity", "3.8"}}), new String[][]{{"getPoint", "", "1"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:6>", "-8.988465674311579E307", "1.0", "-0.53"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:9>", "4.999999999999999", "4.999999999999999"}}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:5>", "0.5", "-4.9E-324", "Infinity"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:6>", "Infinity", "0.49999999999999994"}, false, 6, new String[][]{}), new String[][]{{"getPoint", "", "4"}, {"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:6>", "1.7976931348623155E308", "-0.1", "1.7976931348623157E308"}, false, 5, new String[][]{}, 1), new String[][]{{"getValue", "", "5"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "Infinity", "-0.24999999999999997"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:0>", "-1.0", "0.05"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:8>", "<sample:4>", "NaN", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<sample:5>", "0.29999999999999993", "0.9999999999999999", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "0.0", "-8.98846567431158E307", "-0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getPoint", "", "1"}, {"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=-1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:2>", "1.0", "NaN", "-Infinity"}, false, 7, new String[][]{}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "NaN", "-1.7976931348623155E307"}, false, 6, new String[][]{}, 3), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"26"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:2>", "0.49999999999999994", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=26, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "-0.0", "NaN", "-0.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "262154"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=262154, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:0>", "0.49999999999999994", "8.988465674311579E307", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:2>", "2.0", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "-1.0", "NaN"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:6>", "-0.5", "0.049999999999999996", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:1>", "-0.05", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:6>", "0.0", "Infinity"}, false, 5, new String[][]{}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "NaN", "-8.98846567431158E307"}, false, 1, new String[][]{}), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "1.7976931348623157E308", "-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "-22.0", "NaN", "-Infinity"}, false, 7, new String[][]{}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "-4.9E-324", "-11.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:5>", "-0.049999999999999996", "0.24999999999999997", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:8>", "<sample:7>", "4.9E-324", "NaN", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:6>", "11.200000000000001", "-0.24999999999999997"}, false, 7, new String[][]{}, 3), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "Infinity", "1.7976931348623155E308"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<null>", "NaN", "-2.0", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=-1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:11>", "-1.7976931348623157E308", "-4.9E-324"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:9>", "<sample:3>", "1.7976931348623157E308", "0.9999999999999999", "1.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "-1.7976931348623155E308", "NaN"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:7>", "1.7976931348623155E308", "-1.7976931348623155E308"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "-1.0000000000000002", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:2>", "Infinity", "0.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:3>", "1.0", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "39.5", "NaN", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "-1.7976931348623157E308", "-4.9E-324"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:1>", "-Infinity", "1.7976931348623157E308", "Infinity"}}), new String[][]{{"getValue", "", "6"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<null>", "1.0", "-1.0", "-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "8.988465674311579E307", "0.0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:4>", "0.5", "0.5", "-2.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=4, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:8>", "Infinity", "5.3", "-1.0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:10>", "-0.9999999999999999", "-0.0", "Infinity"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "-Infinity", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:8>", "1.7976931348623157E308", "1.0", "10.0"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:8>", "-1.0", "NaN", "-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:5>", "-1.7976931348623157E308", "0.49999999999999994"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:0>", "1.7976931348623155E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "1.7976931348623157E308", "-1.0", "Infinity"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:5>", "-Infinity", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:6>", "Infinity", "8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483615"}}), new String[][]{{"getPoint", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=2147483615, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=5, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:3>", "0.19999999999999996", "-4.4942328371557893E307"}, false, 4, new String[][]{}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:5>", "1.7976931348623155E308", "-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483589"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=2147483589, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-11, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:7>", "0.0", "-1.7976931348623157E308"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:6>", "-14.0", "-Infinity"}, false, 4, new String[][]{}, 1), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:1>", "-1.7976931348623157E308", "0.0", "-1.7976931348623157E308"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<null>", "0.5", "0.5", "0.49999999999999994"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:7>", "Infinity", "0.0", "-0.055999999999999994"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:10>", "<sample:4>", "-8.988465674311578E307", "1.7976931348623157E308", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:0>", "NaN", "-1.0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-4086"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-4086, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "1.0", "-Infinity"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:8>", "1.0", "NaN", "-5.9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:1>", "Infinity", "-Infinity", "Infinity"}, false, 6, new String[][]{}, 2), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=4, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:6>", "-1.7976931348623157E308", "Infinity", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:4>", "-Infinity", "-Infinity"}}, 2), new String[][]{{"getValue", "", "3"}, {"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:3>", "0.5", "-Infinity", "-0.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<null>", "0.0", "-29.0", "0.4999999999999999"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 3), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=2147483647, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "-0.31", "0.0", "-1.0E-323"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "-1.7976931348623157E308", "-4.9E-324"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:0>", "1.7976931348623157E308", "0.49999999999999994"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:2>"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:10>", "-Infinity", "-Infinity", "-8.988465674311578E307"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "-0.1", "1.7976931348623157E308", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "67"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=67, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:10>", "1.0", "-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:10>", "<sample:3>", "-Infinity", "0.5", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:3>", "Infinity", "Infinity", "-8.988465674311578E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:6>", "1.0", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "0.5", "-4.4942328371557893E307"}, false, 6, new String[][]{}, 1), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:2>", "NaN", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=2147483647, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:5>", "0.5", "-Infinity", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:5>", "-Infinity", "40.0", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-45"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-45, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:6>", "1.13", "-Infinity", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}}, 2), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "25"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:5>", "Infinity", "-0.49999999999999994", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=25, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "-4.6000000000000005", "4.999999999999999", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=3, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "-1.0E-323", "-1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-27"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-27, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "-Infinity", "NaN", "-0.06000000000000005"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:3>", "4.9E-324", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "Infinity", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "131082"}}, 1), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=131082, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "-Infinity", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=2147483647, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:6>", "0.6499999999999999", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "11"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=11, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:2>", "55.0", "Infinity", "0.5"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:0>"}}, 2), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:6>", "-1.0", "-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "0.49999999999999994", "0.24999999999999997"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:6>", "-1.0", "NaN", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:4>", "Infinity", "-Infinity", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "NaN", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:5>", "-0.5", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073741823"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1073741823, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:1>", "-0.49999999999999994", "0.9999999999999999"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "-8.988465674311579E307", "0.049999999999999996", "0.24999999999999997"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2"}}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=2, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "-8.988465674311579E307", "-4.4942328371557893E307"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:2>", "-Infinity", "-0.5", "-8.988465674311579E306"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "1.7976931348623157E308", "-0.25"}, false, 4, new String[][]{}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "1.0000000000000002", "-1.5600000000000003"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:4>", "-0.5", "NaN", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:7>", "-4.9E-324", "0.5000000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "0.5", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-57"}}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=-57, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:3>", "-1.062", "-1.038"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:3>", "-1.0000000000000002", "-4.9E-324", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "NaN", "-Infinity", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "0.9999999999999999", "NaN"}, false, 6, new String[][]{}, 2), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:4>", "0.0", "1.0", "NaN"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "NaN", "-1.0E-323", "-8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:5>", "0.5000000000000001", "-0.0", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:0>", "0.5", "0.21999999999999997", "-1.7976931348623157E308"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "1.1200000000000003", "0.49999999999999994"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:6>", "0.0", "-63.0", "NaN"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 1), new String[][]{{"getPoint", "", "3"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:9>", "0.49999999999999994", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483627"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=2147483627, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "-0.49999999999999994", "-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:0>", "NaN", "0.5"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=2147483647, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:6>", "-Infinity", "-8.988465674311578E307"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1879048192"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=-1879048192, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "-Infinity", "0.48", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:7>", "-4.9E-324", "0.0", "-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "-8.988465674311578E307", "-0.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:6>", "-1.7976931348623157E308", "0.49999999999999994"}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:3>", "4.9E-324", "0.049999999999999996", "-Infinity"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:9>", "1.7976931348623155E308", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-14"}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=-14, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:0>", "-0.9999999999999999", "-5.9", "0.5000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "-0.5", "0.5", "-0.49999999999999994"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:5>", "-Infinity", "-4.4942328371557893E307", "-1.0E-323"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "-Infinity", "0.0", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:8>", "-0.005", "1.7976931348623157E308"}}, 3), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<null>", "Infinity", "0.0", "-8.988465674311579E307"}, false, 7, new String[][]{}, 1), new String[][]{{"getPoint", "", "7"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:5>", "-4.9E-323", "1.97"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:5>", "0.5", "1.0"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "1.0000000000000002", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:6>", "1.0", "-1.7976931348623157E308"}}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:0>", "2.0", "-8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "134217744"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217744", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=134217744, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:1>", "-0.5", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "-4.9E-324", "1.7976931348623158E307", "-Infinity"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:2>", "-0.5", "Infinity", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:12>", "<sample:4>", "0.0", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:7>", "-1.0", "0.9390000000000001", "-4.9E-323"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:1>", "-1.0E-322", "-8.988465674311579E307", "8.98846567431158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:1>", "0.45800000000000013", "NaN", "0.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}}, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=-1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147418128"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147418128, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-34"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073741824"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1073741824, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:5>", "8.988465674311579E307", "-15.75", "0.9999999999999998"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:7>", "-0.9999999999999999", "0.49999999999999994"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:1>", "NaN", "-Infinity", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:3>", "NaN", "-0.5"}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:4>", "-8.988465674311579E307", "3.6"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "18"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:6>", "-1.7976931348623157E308", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=18, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-29"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-29, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "1.7976931348623157E308", "-8.98846567431158E307", "-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:7>", "Infinity", "-2.0000000000000004", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-65547"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=-65547, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<sample:1>", "NaN", "1.0E-323", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "0.0", "-Infinity", "-1.0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-64"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=-64, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:0>", "-1.0", "-0.25", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:4>", "4.9E-324", "-Infinity", "8.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "-1.0", "-Infinity", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:0>", "1.0", "-0.25"}}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:6>", "2.75", "-1.76", "-1.7976931348623155E308"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "-1.0", "0.5", "0.49999999999999994"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-65509"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=-65509, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "-Infinity", "-8.98846567431158E307", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147418112"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147418112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147418112, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "0.49999999999999994", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-23"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-23, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:1>", "-1.0", "16.0", "0.05"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<null>", "-4.9E-324", "42.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1073741823, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-8202"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-8202, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "268435594"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("268435594", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=268435594, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:0>", "Infinity", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:10>", "-8.988465674311579E307", "NaN", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "15"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=15, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:1>", "Infinity", "-Infinity", "0.49999999999999994"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1025"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1025, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:8>", "1.7976931348623157E308", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:2>", "-0.0", "1.1400000000000003", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:2>", "-Infinity", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:4>", "-0.5", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483631"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483631, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073741809"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1073741809, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=19, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "-1.7976931348623157E308", "-8.988465674311579E307", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<null>", "26.0", "-2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<null>"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-4, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:3>", "-0.0", "-0.0", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:6>", "NaN", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "-8.988465674311578E307", "2.9000000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-32"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-32, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:2>", "0.9999999999999999", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "-1.0", "-4.9E-323", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:7>", "-8.988465674311579E307", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:1>", "-1.7976931348623157E308", "-1.0E-323"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:4>", "0.17999999999999994", "-1.7976931348623157E308", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:3>", "NaN", "-8.988465674311579E307", "-1.0E-323"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:8>", "-0.0", "33.0", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "Infinity", "0.0", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1073741823, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "-8.988465674311579E307", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-4, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:5>", "8.988465674311579E307", "-2.0", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:4>", "-1.7976931348623157E308", "-0.0", "0.49999999999999994"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:1>", "NaN", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:0>", "-8.988465674311579E307", "0.1"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483594"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483594", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483594, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:1>", "4.9E-324", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:2>", "-Infinity", "-8.988465674311579E307", "-0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:7>", "-8.988465674311579E307", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
}
