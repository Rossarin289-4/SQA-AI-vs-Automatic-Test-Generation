package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:7>", "1.7976931348623157E308", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:0>", "NaN", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "6"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "Infinity", "-Infinity", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=65280, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:1>", "Infinity", "8.9215"}, false, 17, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:0>", "NaN", "10.0", "-1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "Infinity", "-Infinity", "Infinity"}, false, 4, new String[][]{}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "Infinity", "-Infinity", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:9>", "NaN", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "Infinity", "Infinity", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:8>", "NaN", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"158"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:3>", "0.5", "0.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=158, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"200"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:3>", "0.5", "0.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=200, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:3>", "0.5", "0.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:5>", "NaN", "8.988465674311579E307", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:5>", "NaN", "8.988465674311579E307", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:1>", "0.5", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "8.988465674311579E307", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:3>", "NaN", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<null>", "-1.7976931348623157E308", "0.5", "-1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:3>", "NaN", "0.2"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "NaN", "0.2"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "NaN", "NaN"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:2>", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:2>", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:2>", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=512, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:3>", "-1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "0.5", "1.0", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<null>", "Infinity", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:3>", "-1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "0.5", "1.0", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:9>", "0.5", "-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:2>", "-67.514", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:3>", "-67.514", "-0.09500000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-27"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:3>", "Infinity", "-Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-27, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:2>", "Infinity", "-Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=5, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<null>", "0.5", "-1.7976931348623157E308", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:6>", "0.5", "-1.7976931348623157E308", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "1.0", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:0>", "0.5", "1.7976931348623158E307", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "2"}, {"getValue", "", "3"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:0>", "0.5", "1.7976931348623158E307", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "0.949"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "0.949"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "0.949"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "0.949"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "0.949"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:3>", "-Infinity", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:2>", "-Infinity", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:2>", "-Infinity", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<null>", "-1.0", "8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<null>", "2.0", "-Infinity"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:9>", "-1.7976931348623157E308", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "0.0", "1.7976931348623157E308", "-0.117"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "0.0", "1.7976931348623157E308", "-0.117"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "0.0", "1.7976931348623157E308", "-0.117"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "0.0", "Infinity", "-0.117"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:6>", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "-0.0", "Infinity", "-0.234"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:6>", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "-0.0", "Infinity", "-0.234"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:6>", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:7>", "6.4", "NaN", "-35.4"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:7>", "6.4", "NaN", "-35.4"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:7>", "52.4", "NaN", "-35.400000000000006"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:1>", "-10.0", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "-1.0", "4.9E-324"}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "52.4", "NaN", "-1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:1>", "-10.0", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "0.0", "8.988465674311579E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "-1.0", "4.9E-324"}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "52.4", "NaN", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "0.0", "8.988465674311579E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "-1.0", "4.9E-324"}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "52.4", "NaN", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "0.0", "8.988465674311579E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "-1.0", "4.9E-324"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:6>", "52.4", "NaN", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "0.0", "8.988465674311579E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:3>", "-1.0", "4.9E-324"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "Infinity", "0.5", "-0.74"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:0>", "0.0", "-3.1999999999999997", "0.7399999999999999"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=512, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-4"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:2>", "1.7976931348623157E308", "8.988465674311579E307", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=-4, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"11"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:2>", "1.7976931348623157E308", "8.988465674311579E307", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=11, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"27"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:2>", "1.7976931348623157E308", "8.988465674311579E307", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=27, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "6"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:0>", "NaN", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "6"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "Infinity", "-Infinity", "1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}}), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "Infinity", "Infinity", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<null>", "-1.0", "1.0", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "1.0", "Infinity", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:9>"}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:3>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:3>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"20"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:3>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=20, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:3>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:3>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=-1073741824, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483599"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483599, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<null>", "8.988465674311579E307", "NaN", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483599"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483599, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "Infinity", "1.7976931348623157E308", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=2048, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "Infinity", "1.7976931348623157E308", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6400, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "Infinity", "1.7976931348623157E308", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=25500, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "Infinity", "1.7976931348623157E308", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=65280, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "Infinity", "1.7976931348623157E308", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "NaN", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:2>", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:2>", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "0.5", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "-67.514", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "-67.514", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:6>", "0.0", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:0>", "0.5", "1.7976931348623157E308", "1.7976931348623157E308"}, false, 1, new String[][]{}), new String[][]{{"getPoint", "", "2"}, {"getValue", "", "3"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "-1.0", "0.949"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:3>", "-Infinity", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:3>", "-Infinity", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<null>", "1.0", "-1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<null>", "1.0", "-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<null>", "2.0", "-Infinity"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<null>", "2.0", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:1>", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "0.0", "1.7976931348623157E308", "-0.117"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:6>", "52.4", "NaN", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:5>", "0.0", "8.988465674311579E307", "-8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:6>", "52.4", "0.5", "-8.988465674311579E307"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:5>", "0.0", "8.988465674311579E307", "-8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=512, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "0.5", "Infinity", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "Infinity", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "0.5", "Infinity", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-Infinity", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "NaN", "Infinity", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-Infinity", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "NaN", "Infinity", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-Infinity", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "NaN", "Infinity", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-Infinity", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "NaN", "Infinity", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("90", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "0.5", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=2147483647, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:9>", "1.7976931348623157E308", "-1.7976931348623157E308", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:6>", "8.988465674311579E307", "1.0", "-1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "Infinity", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=-18, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:6>", "8.988465674311579E307", "1.0", "-1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "Infinity", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=-7, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "-Infinity", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=-10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<null>", "0.5", "-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:2>", "1.0", "-Infinity", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<sample:3>", "8.9", "-Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<null>", "NaN", "8.988465674311579E307", "1.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:4>", "0.5", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<sample:2>", "8.9", "-Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:1>", "-1.0", "-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<null>", "0.0", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:2>", "1.7976931348623157E308", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=65280, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:4>", "1.7976931348623157E308", "0.5", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:5>", "Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "1.7976931348623157E308", "0.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:1>", "-1.0", "-1.0", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:9>", "0.5", "0.5"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}), new String[][]{{"getPoint", "", "1"}, {"getValue", "", "4"}, {"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:5>", "1.7976931348623157E308", "4.9E-324"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:5>", "8.988465674311579E307", "NaN", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:5>", "8.988465674311579E307", "NaN", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=512, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:5>", "8.988465674311579E307", "NaN", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=65280, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:2>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:5>", "8.988465674311579E307", "NaN", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "0.0", "Infinity"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6400, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "0.5", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "4"}, {"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "0.5", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "4"}, {"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:0>", "-1.19", "0.0", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}), new String[][]{{"getAbsoluteThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:0>", "-1.19", "0.0", "0.5"}}, 1), new String[][]{{"getAbsoluteThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:0>", "-1.19", "0.0", "0.5"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:0>", "-1.0899999999999999", "0.0", "51.5"}}, 1), new String[][]{{"getAbsoluteThreshold", "", "5"}, {"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:1>", "8.988465674311579E307", "1.7976931348623157E308"}}, 1), new String[][]{{"getAbsoluteThreshold", "", "5"}, {"getRelativeThreshold", "", "5"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:3>"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}, {"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=25500, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<null>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:4>", "NaN", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<null>", "4.4942328371557893E307", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "3"}, {"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:2>", "NaN", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:6>", "Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:9>", "-Infinity", "8.988465674311579E307", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:5>", "NaN", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=256000, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "55"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:9>", "NaN", "NaN"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=55, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:4>", "-4.0E-323", "-3.4999999999999982"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"getAbsoluteThreshold", "", "5"}, {"getRelativeThreshold", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:2>", "Infinity", "NaN", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "-1.7976931348623157E308", "NaN", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 1), new String[][]{{"getValue", "", "2"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "-1.7976931348623157E308", "NaN", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:5>", "0.5", "0.0", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "59"}}, 1), new String[][]{{"getValue", "", "2"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=59, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "-1.7976931348623157E308", "NaN", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:5>", "0.5", "0.0", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "59"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}}, 1), new String[][]{{"getValue", "", "2"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "0.9999999999999999", "1.7976931348623157E308", "1.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getValue", "", "7"}, {"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "Infinity", "8.988465674311579E307", "8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483648, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=10, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "Infinity", "1.7976931348623157E308", "-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:3>", "Infinity", "0.5", "-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<null>"}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:8>", "-Infinity", "0.0", "8.988465674311579E307"}, false, 9, new String[][]{}, 2), new String[][]{{"getPoint", "", "6"}, {"getPoint", "", "6"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "-Infinity", "0.0", "-8.988465674311579E307"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:5>", "NaN", "-0.12"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:2>"}}), new String[][]{{"getValue", "", "4"}, {"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "55"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("55", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=55, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "60"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=60, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:5>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "68"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("68", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=68, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:3>", "-Infinity", "-1.7976931348623157E308", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}), new String[][]{{"getRelativeThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "1.0", "0.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "1.0", "0.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=1, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-46"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-46, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:9>", "-1.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1073741824"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1073741824, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<null>", "-Infinity", "Infinity"}}, 2), new String[][]{{"getAbsoluteThreshold", "", "0"}, {"getRelativeThreshold", "", "3"}, {"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3), new String[][]{{"getAbsoluteThreshold", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "8.988465674311579E307", "-1.7"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getValue", "", "6"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "8.988465674311579E307", "-1.7"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2), new String[][]{{"getValue", "", "6"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=90, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:1>", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483637"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483637, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:3>", "0.0", "0.5", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:3>", "0.0", "0.5", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<null>", "0.5", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "0.5", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:5>", "NaN", "1.06"}}, 3), new String[][]{{"getValue", "", "6"}, {"getPoint", "", "6"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "8.988465674311579E307", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "8.988465674311579E307", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "8.988465674311579E307", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "8.988465674311579E307", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:1>", "8.988465674311579E307", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}}, 2), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "0.0", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "5.800000000000001", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "5.800000000000001", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:4>", "-1.0", "Infinity", "8.988465674311579E307"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:6>", "-Infinity", "1.0", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:4>", "-8.988465674311579E307", "0.9999999999999999"}, false, 3, new String[][]{}, 1), new String[][]{{"getPoint", "", "1"}, {"getValue", "", "7"}, {"getPoint", "", "6"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:5>", "1.7976931348623157E308", "-Infinity", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=1073741823, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:1>", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:5>", "1.0", "1.7976931348623157E308", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:5>", "-1.0", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:5>", "-1.0", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:5>", "-1.0", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "-1.7976931348623157E308", "8.988465674311579E307"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:5>", "-1.0", "1.7976931348623157E308", "0.5"}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "1.7976931348623157E308", "-8.988465674311579E307"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:12>", "8.988465674311579E307", "0.5", "2.0"}}, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "1.7976931348623157E308", "4.494232837155789E307"}, false, 14, new String[][]{}, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "-1.7976931348623157E308", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483640"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-2147483640, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1073741820"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741820", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=-1073741820, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483640"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483640, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483640"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<null>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=2147483647, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "0.956", "-Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "6"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=-1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "0.982", "-Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "6"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:9>", "<sample:0>", "-1.0", "-1.0", "0.5"}, false, 3, new String[][]{}, 3), new String[][]{{"getValue", "", "2"}, {"getPoint", "", "2"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:12>", "<sample:3>", "Infinity", "1.41", "1.7976931348623157E308"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getPoint", "", "2"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:1>", "0.0", "4.9E-324"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 3), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=1, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "0.144", "8.988465674311579E307"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "0.0", "-Infinity", "-1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "10"}}, 3), new String[][]{{"getValue", "", "3"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=10, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "-57.418", "-4.4942328371557893E307"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:0>", "0.5", "1.0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<sample:4>", "-3.3000000000000003", "0.5", "-1.0"}}, 1), new String[][]{{"getPoint", "", "6"}, {"getPoint", "", "0"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:2>", "3.5953862697246315E307", "-25.521499999999996"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:0>", "0.5", "8.988465674311579E306"}}, 1), new String[][]{{"getValue", "", "6"}, {"getValue", "", "4"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:4>", "Infinity", "0.40000000000000013"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:4>", "Infinity", "0.40000000000000013"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:4>", "Infinity", "0.40000000000000013"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<null>", "Infinity", "-1.0", "1.7976931348623155E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:2>", "-1.0", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:3>", "-Infinity", "-Infinity", "-0.0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:4>", "-2.4199999999999995", "Infinity"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=72, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:7>", "4.890000000000001", "Infinity"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-52"}}, 1), new String[][]{{"getPoint", "", "4"}, {"getPoint", "", "4"}, {"getValue", "", "5"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=-52, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "0.463375", "-4.82"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1), new String[][]{{"getValue", "", "4"}, {"getPoint", "", "5"}, {"getValue", "", "1"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=192, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:0>", "Infinity", "-Infinity"}, false, 13, new String[][]{}, 3), new String[][]{{"getValue", "", "5"}, {"getValue", "", "2"}, {"getPoint", "", "3"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=132, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:9>", "1.0", "1.0", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=512, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:6>", "-1.7976931348623157E308", "41.017", "NaN"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:8>", "1.7976931348623157E308", "8.988465674311579E307"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:7>"}}, 2), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=42, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "-1.7976931348623158E307", "47.59700000000001", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.ConvergenceChecker", "<sample:4>"}}, 2), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "Infinity", "1.0", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-256"}}, 2), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=-256, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:4>", "Infinity", "NaN", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.ConvergenceChecker"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:4>", "Infinity", "NaN", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=56, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "NaN", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073741823"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:6>", "1.7976931348623157E308", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getMaxEvaluations=-2147483648, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getMaxEvaluations=0, getOptima=!MathIllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:3>", "Infinity", "-1.0000000000000002", "-Infinity"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:8>", "<sample:0>", "-Infinity", "-Infinity", "21.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=512, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:6>", "1.7976931348623157E308", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:5>", "1.7976931348623157E308", "0.5", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2048, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:5>", "1.7976931348623157E308", "0.5", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6400, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:4>", "8.9215", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=-2, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:4>", "8.9215", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:4>", "8.9215", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:4>", "8.9215", "NaN"}, {"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:2>", "1.7976931348623157E308", "NaN", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=110, getMaxEvaluations=0, getOptima=?}", SearchInputFactory_scaffolding.receiverState());
 }
}
