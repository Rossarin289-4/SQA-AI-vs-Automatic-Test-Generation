package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "-0.7000000000000003", "-0.11799999998"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:8>", "-0.0", "1.0000000000000002E-10", "12.95"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:12>", "0.21699999999999997", "0.11799999998", "-3.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:1>", "0.09449999999999999", "0.062"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=41, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=39, getMax=0.062, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.09...#310#-48448892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"6"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:14>", "<sample:5>", "-1.7976931348623157E308", "5.0E-10", "-12.00000001"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=102, getFunctionValue=NaN, getGoalType=MINIMIZE, getIterationCount=101, getMax=5.0E-10, getMaxEvaluations=6, getMaximalIterationCount=100, getMin=-1.797693...#299#-1140636419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"-0.1"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:14>", "<sample:2>", "-0.0", "0.9999999999999999", "0.11799999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-0.1, getGoalType=MAXIMIZE, getIterationCount=50, getMax=0.9999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#300#-1980495843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:4>", "1.0", "-0.05"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.04999999993214202", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=48, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=47, getMax=-0.05, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0, getRe...#275#1126141496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623153E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "38"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=38, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-460830335", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "2.5E-10", "0.25"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6881442373175297E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=48, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=47, getMax=0.25, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.5E-10, ge...#289#-337815873", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.0E-323", "2.0000000000000005E-9", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:4>", "10.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=2.0000000000000005E-9, getGoalType=null, getIterationCount=-1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin...#273#-479848269", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:0>", "-0.30000000000000004", "NaN"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=0, getMax=NaN, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.30000...#275#-151064344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:6>", "1.0E-9", "-1.7976931348623157E308", "1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=44, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100,...#298#1569009258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccuracy...#255#-342872198", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccuracy...#255#-701312381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"92"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=92, getMin=0.0, getRelativeAccurac...#256#-1013582040", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=2147483647, getMaximalIterationCount=100, getMin=0.0, getRela...#267#695365640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0E-9"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "Infinity", "1.0E-323", "1.0E-10"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:6>", "0.15999999999999998", "-1.0E-9", "5.0E-10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=1.0E-323, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity,...#271#2131630761", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:3>", "-0.23599999996000004", "-3.16", "-4.9E-324"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.1599999947251978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=-3.16, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.2359999...#295#-757086770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:8>", "NaN"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"4102"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=4102, getMin=0.0, getRelativeA...#262#-965245833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:3>", "NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:7>", "-1.1799999998000001", "0.0", "-0.60999999999"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1674436835558038E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=52, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=51, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.179...#307#1784779535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:2>", "-1.0", "-1.7976931348623155E308", "0.95"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=44, getMax=-1.7976931348623155E308, getMaxEvaluations=1000, getMaximalIterationCount=100,...#282#-308585575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:6>", "-1.0000000000000003E-9", "2.0879999999999996", "0.15999999999999998"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.087999996890686", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=42, getMax=2.0879999999999996, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#318#1593135030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-Infinity, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRela...#267#1616811032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<null>", "-42.0"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:0>", "Infinity", "1.018", "4.000000000000001"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#400017220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "-0.030000000000000006", "32.999999999", "-0.11799999998"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("32.999999943718066", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=32.999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0....#307#-2071189491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"10.000000000000002"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"NaN", "0.2920000000000001", "-4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "-0.05", "1.0E-10", "10"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.2920000000000001, getGoalType=null, getIterationCount=-4, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=3, getMin=0.0,...#262#-1644457786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:4>", "0.015000000000000003", "-0.7000000000000002", "0.5"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6999999987620227", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=44, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=43, getMax=-0.7000000000000002, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#303#-1157246371", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:10>", "0.34", "1.7976931348623157E308"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-526595762", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:6>", "-1.0E-323", "-9.999999999999999E-10", "-1.0000000000000003E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=10, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=9, getMax=-9.999999999999999E-10, getMaxEvaluations=1000, getMaximalIterationCount=...#323#-1516565254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "-0.07000000000000003", "-0.7000000000000002", "Infinity"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=-0.7000000000000002, getMaxEvaluations=1000, getMaximalIterationCount=100, getMi...#295#-948464250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<null>", "1.9999999999999998", "-0.7000000000000004", "9.999999999999999E-11"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9999999966615174", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=null, getIterationCount=42, getMax=-0.7000000000000004, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=...#314#797421879", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=2147483647, getMaximalIterationCount=100, getMin=0.0, getRela...#267#1397300233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:3>", "-9.999999999999999E-10", "0.529999999", "1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<null>", "1.0", "1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5299999981153022", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=0.529999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-9.9...#300#99375875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:4>", "0.5", "-Infinity", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "-0.25", "5.25", "32"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=5.25, getGoalType=null, getIterationCount=32, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelative...#263#1133393076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.35"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:4>", "0.3199999999999999", "-1.0E-323", "1.0E-323"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:7>", "3.0", "-1.0E-9", "5.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=56, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=56, getMax=-1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=3.0, get...#277#-477941447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#269#19225892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"-0.7000000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-0.7000000000000003, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#277#1157236614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=2147483647, getMin=0.0, getRel...#268#426950436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:3>", "1.7976931348623155E308", "-1.0", "-1.4000000000000006"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=44, getMax=-1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.797693134...#295#-733290731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:1>", "-8.988465674311579E307", "0.15000000000000005", "-6.099999990000001"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"3.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=3.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1807973400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "5.000000000000001", "-4.9E-324", "-5.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.999999994693523", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=44, getMax=-4.9E-324, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0000...#289#1584991442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "129.49999999999997", "Infinity", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=129.49999...#277#-2146847772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "1.0E-11", "-6.25"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "-0.28999999989999997", "0.15000000000000002", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.2499999926033425", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=41, getMax=-6.25, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, g...#288#-1853130613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#254#-2087104708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#-387320532", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.035"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:1>", "1.0E-9", "1.7976931348623157E308"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "-4.9E-324", "0.30000000000000004"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2577308478103538E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=48, getMax=0.30000000000000004, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#311#-1796913657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-16"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-16, getMaximalIterationCount=100, getMin=0.0, getRelativeAcc...#260#26034566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "0.0", "NaN", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=5, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1369643255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#254#-953914115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:1>", "0.0", "0.3", "62.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:4>", "-49.99999999999001", "-19.0", "-5.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "-0.37"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.37, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-2097522617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:3>", "Infinity", "4.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=4.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity, g...#260#728022713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1498354994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#269#268504293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#269#19225892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:3>", "3.9000000000100004", "20.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=1, getMin=0.0, getRelativeAccuracy...#255#-1086679164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=10, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#1465526715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<null>", "0.0", "5.0000000000000005E-12"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "-46"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-1, getMin=0.0, getRelativeAcc...#260#-872669284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:1>", "0.30000000000000004"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:6>", "1.0000000000000002"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-64"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-64, getMin=0.0, getRelativeAc...#261#2034395829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:7>", "2.0", "0.0", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0, get...#268#1422393113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "1.0E-11", "4.999999999999999", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=0, getMax=4.999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=...#280#1630374513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:4>", "-8.988465674311579E307", "-1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.98846566365966E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-8.988...#317#889547358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.05"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:5>", "0.9999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.05, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-208183131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-0.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-424245786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "0.30000000000000004", "-1.0000000000000002", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0000000000000002, getGoalType=null, getIterationCount=2, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#277#1940410531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-2147483648, getMaximalIterationCount=100, getMin=0.0, getRel...#268#-799117170", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=1, getMin=0.0, getRelativeAccu...#259#-592714885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:3>", "-20.0", "-24.0", "56.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-23.999999973002524", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=46, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=45, getMax=-24.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-20.0, get...#275#1791310750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.04"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-407208293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-0.05"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#260#-1671612158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "-0.1", "-Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=-Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.1, g...#272#-2071343747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0E-10"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#262#1897615821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "-0.05", "1.5999999999999996"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.04999999993582481", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=48, getMax=1.5999999999999996, getMaxEvaluations=1000, getMaximalIterationCount=100...#309#-340416229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"3.46", "69.0", "-12"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=69.0, getGoalType=null, getIterationCount=-12, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativ...#252#1372188823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<null>", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:8>", "-1.0E-9", "0.125", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "0.7000000000000003", "Infinity"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=0, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.7000000...#282#2101453082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "1.5E-323", "5.0E-11", "1.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1959899428864245E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=53, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=52, getMax=5.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.5E-323...#282#-1618251589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:2>", "5.0E-10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:4>", "0.020000000000000018"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "9.999999999999999E-10"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1698388807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"0.025"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:1>", "1.0E-323", "0.3", "1.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=0.025, getGoalType=MINIMIZE, getIterationCount=42, getMax=0.3, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-323, ...#280#-1446227081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:1>", "9.0", "0.41000000000000003"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.41000000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=48, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=47, getMax=0.41000000000000003, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#288#-1955179723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:3>", "0.6100000005", "4.9999999999999995E-11"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.753498777423088E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=49, getMax=4.9999999999999995E-11, getMaxEvaluations=1000, getMaximalIterationCount=100,...#312#858107369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-0.05"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#260#-1365977629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"-0.7000000000000004"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-0.7000000000000004, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#277#-1027039323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"5.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.0, getEvaluations=0, getFunctionValue=5.0E-10, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#-1776264735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.0E-10"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0E-10, getEvaluations=0, getFunctionValue=-1.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#-1291929920", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"5.0E-10"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=5.0E-10, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelati...#265#612005391", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:1>", "-1.1799999998000001", "1.0", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.17999999980...#268#-776918014", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "-0.22299999996", "-1.0", "0.5"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999985061381", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=44, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=43, getMax=-1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.22299999...#282#-2048990793", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:8>", "0.508", "-0.11799999998000003", "1.7976931348623157E308"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "-Infinity", "-0.35000000000000003"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=0, getMax=-0.35000000000000003, getMaxEvaluations=1000, getMaximalIterationCount=100...#281#1040953308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#254#-2087104708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "5.0", "5.0", "5.0E-10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9999999916537945", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=42, getMax=5.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0, g...#279#39479041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<null>", "0.0", "-4.937"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "5.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-Infinity, getGoalType=null, getIterationCount=41, getMax=-4.937, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getR...#276#506128109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.5", "4.9E-324", "5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=4.9E-324, getGoalType=null, getIterationCount=5, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelat...#254#1148568737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<null>", "1.0E-9", "35.6000000005", "1.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("35.59999994107501", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-Infinity, getGoalType=null, getIterationCount=42, getMax=35.6000000005, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=...#286#-1194757072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:1>", "0.31999999999999995", "1.9999999999999998", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=1.9999999999999998, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin...#283#-105010029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.31999999999999995"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#272#92587853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<null>", "0.039999999999999994", "-0.05"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.049999999938459994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=0.0, getGoalType=null, getIterationCount=42, getMax=-0.05, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.039999999999...#306#884599481", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=4, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#316069928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=10, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#1465526715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-0.39999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-0.39999999998, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#272#835815932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:0>", "5.0E-10", "4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2542485914826085E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=7, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=6, getMax=4.9E-324, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0E-10, ...#284#-922869625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=4, getMin=0.0, getRelativeAccuracy...#255#2052187783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=2147483647, getMaximalIterationCount=100, getMin=0.0, getRela...#267#695365640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#800585866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:8>", "38.0000000005", "4.000000000000001", "-1.7976931348623157E308"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "4.9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=4.9, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#254#879752329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:7>", "NaN", "-92.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=-92.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=NaN, getRela...#254#-303130110", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "4.9E-324", "-4.4", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-4.4, getGoalType=null, getIterationCount=5, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#251#-1052136080", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:3>", "-0.025", "-26.0", "-57.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "-0.23599999996", "0.7000000000000003"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6999999987359842", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=0.7000000000000003, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#311#1292324494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:3>", "1.0000000000000001E-11", "10.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:9>", "0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1698388807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-0.5399999998"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-424245786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"65540"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=65540, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#1776581062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-5.0E-10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#263#202245806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "-0.11799999998", "-0.5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MAXIMIZE, getIterationCount=0, getMax=-0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.1179999999...#288#1671389617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:7>", "0.0", "-0.11799999998"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.11799999985016232", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=41, getMax=-0.11799999998, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0...#293#1338686597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:7>", "-1.0000000000000002"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#256#507357510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:0>", "0.1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.5", "0.5", "2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.5, getGoalType=null, getIterationCount=2147483647, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getR...#258#1089685145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.04399999899999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "0.009999999999999981"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.04399999899999999, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, g...#273#1264287590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"12.949999999999998"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=12.949999999999998, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#272#-636697118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"NaN", "NaN", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#258#1272432144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.017000000100000003"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#275#-1420677702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "0.5", "-6.2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:6>", "4.999999999999999E-10", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.1999999915700625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-6.2, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.5, getRel...#273#-1332859330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:2>", "-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-Infinity"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#264#-621644183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:3>", "-0.09"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:2>", "7.763", "0.15999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=49, getMax=0.15999999999999998, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#291#113552028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:11>", "<sample:11>", "-1.0000000000000002", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=NaN, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0000000000...#269#-606199463", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "NaN", "1.0000000000000002E-10", "0.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=1.0000000000000002E-10, getMaxEvaluations=1000, getMaximalIterationCount=100, ge...#271#-1784110841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "5.0E-12"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#262#360700627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "5.0E-11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1251656073", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:2>", "2.0", "1.0000000000000002E-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=53, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=52, getMax=1.0000000000000002E-10, getMaxEvaluations=1000, getMaximalIterationCount...#308#-2042496835", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:4>", "1.0000000000000002", "2.0000000000000002E-11"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.776593185012649E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=50, getMax=2.0000000000000002E-11, getMaxEvaluations=1000, getMaximalIterationCount...#327#-610793101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.06499999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#274#-1319262589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "-0.025", "1.0000000000000003E-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=41, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=41, getMax=1.0000000000000003E-10, getMaxEvaluations=1000, getMaximalIterationCount...#310#381098769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"21"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "16390"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=21, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-1869360677", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-0.47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#260#1951310433", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=2147483647, getMin=0.0, getRel...#268#426950436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:0>", "1.0000000000000002E-10", "-0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.5, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=1.0000000000...#301#1716513359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.9E-324, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelative...#261#2027312482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=2, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#883972221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"2.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "-1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "-0.7000000000000003", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "0.33699999999999997"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=NaN, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.70000000000...#268#-326330653", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccuracy...#255#-701312381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:0>", "-0.35000000000000014"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:8>", "0.0", "-1.9999999999999998", "3.5700000000000003"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9999999964486044", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=44, getMax=-1.9999999999999998, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#301#1577413086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<null>", "0.0", "-0.6099999999999999", "-3.0000000000000004"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.51638055768902E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=55, getFunctionValue=-Infinity, getGoalType=null, getIterationCount=54, getMax=-0.6099999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, g...#306#1163993304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "0.0", "-1.0E-323"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=-1.0E-323, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#270#290297293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-268435456"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-268435456, getMaximalIterationCount=100, getMin=0.0, getRela...#267#-1293702462", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-6"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-6, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-195719739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"10.0", "NaN", "0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#249#-903300816", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.7000000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#272#1967412059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:7>", "1.0", "-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:4>", "-7.000000000000003", "0.0", "-4.9E-324"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7765931850481803E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=50, getMax=-0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0, ...#280#1386621212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.11799999998", "-1.0E-9", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0E-9, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0,...#273#-1963940716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:4>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "0.13699999999999996"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.13699999999999996, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, g...#273#-1532986430", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:0>", "NaN", "0.44999999999999996", "-30.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-30.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=0, getMax=0.44999999999999996, getMaxEvaluations=1000, getMaximalIterationCount=100, getMi...#272#-1882154176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:0>", "2.0E-11", "2.0E-323"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=0, getMax=2.0E-323, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0E-11, ...#269#-2024275099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:2>", "2.0E-323", "0.6000000000000001", "0.35800000000000004"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0582051187757942E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=50, getMax=0.6000000000000001, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#309#-715291362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-4.9E-324, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRela...#267#-379622254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:10>", "<sample:8>", "0.1200000002", "12.950000000000003", "-9.999999999999999E-10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.94999997838333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=42, getMax=12.950000000000003, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#311#-784599104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:2>", "-21.999999999500005", "4.999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=0, getMax=4.999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin...#311#-942891715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<null>", "-0.7000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "3.38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#259#1062957085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-3.09999999999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#269#-1824098522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:0>", "2.0E-8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "-0.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.05, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-208183131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:2>", "-0.0", "-2.0E-11", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=0, getMax=-2.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.0, get...#258#1742045375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "0.0", "2.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6964955312674336E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=53, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=52, getMax=2.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRela...#274#840081150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "NaN", "63.0", "3.2999999999000003"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.2999999999000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=63.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=NaN, getRelat...#283#-436715381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#864366175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:5>", "0.5", "4.1000000000100005", "1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.099999993166111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=4.1000000000100005, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#287#-971452950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-1, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-1285256320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "-1.1799999998000001", "0.031999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:1>", "0.5640000000000001", "-1.0E-8", "1.0E-323"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5639999990585479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=-1.0E-8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.564000...#293#654467847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:8>", "<sample:2>", "4.9E-324", "-0.059000000000000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=41, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=40, getMax=-0.059000000000000004, getMaxEvaluations=1000, getMaximalIterationCount=100, getMi...#308#125110320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "0.6000000000000002", "37.000000001"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6000000010463502", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=49, getMax=37.000000001, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.6...#303#-660571780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"7.000000000000003"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#272#1564687791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:9>", "<sample:0>", "1.036", "50.7"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0360000012639627", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=Infinity, getGoalType=MAXIMIZE, getIterationCount=49, getMax=50.7, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.036,...#292#608449162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7650000000000001"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7650000000000001, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#272#-612465542", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<null>", "-0.14000000000000007", "0.22000000050000001", "-0.490000001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22000000004730869", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=0.0, getGoalType=null, getIterationCount=44, getMax=0.22000000050000001, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=...#308#1718105504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=2147483647, getMaximalIterationCount=100, getMin=0.0, getRela...#267#695365640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "4.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#-1775742045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:3>", "3.009", "0.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000007842023", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=44, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=3.009,...#280#1935622425", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#269#19225892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:0>", "9.999999999999999E-11"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"5.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<sample:3>", "-52.000000001", "-5.0", "0.25"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=5.000000000000001, getGoalType=MINIMIZE, getIterationCount=42, getMax=-5.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#295#1728597792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccuracy...#255#-342872198", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1498354994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:10>", "<sample:7>", "-0.5", "0.9999999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=44, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=44, getMax=0.9999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#284#-579606982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:9>", "-0.05"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:9>", "<sample:3>", "0.0", "-0.64"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.12000000009999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6399999992515584", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=Infinity, getGoalType=MINIMIZE, getIterationCount=41, getMax=-0.64, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ...#279#-301271822", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:4>", "4.9E-324", "0.15999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-0.0209999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "6"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:9>", "0.15000000000000002", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=-Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.150000...#286#-1866852128", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:7>", "5.50000000025", "-64.0", "0.0013000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MINIMIZE, getIterationCount=0, getMax=-64.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.5000000002...#286#272788613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.30000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:9>", "5.0", "4.260000000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=38, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=37, getMax=4.260000000000001, getMaxEvaluations=1000, getMaximalIterationCount=100, getMi...#310#-1097402334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "-0.7000000000000003"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.7000000000000003, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, get...#271#-892933938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "-0.6800000000000003"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.6800000000000003, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, g...#273#-1751203258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:3>", "3.002", "0.055", "0.05899999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "-1.7976931348623155E308", "10.0", "3"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0019999950874228", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=0.055, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=3.002, ge...#284#1295776711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "1.0E-10", "1.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.177659318487052E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=50, getMax=1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-1...#292#938168677", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "-0.049999999999999996", "5.18200000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.049999999909601536", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=50, getMax=5.18200000002, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0...#315#735631756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.0E-323", "0.30000000000000004", "11"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "1.0E-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-9, getEvaluations=0, getFunctionValue=0.30000000000000004, getGoalType=null, getIterationCount=11, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#270#2127613832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "12.95", "-1.2139999998000002"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.2139999982333067", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=47, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=46, getMax=-1.2139999998000002, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#303#1459675541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"23.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=23.5, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#-2096967989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-29"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-29, getMin=0.0, getRelativeAccura...#257#-1604866809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"65"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=65, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#1970958939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:9>", "<sample:8>", "12.95", "2.9999999999999996", "1.28"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.949999981440623", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=Infinity, getGoalType=MAXIMIZE, getIterationCount=42, getMax=2.9999999999999996, getMaxEvaluations=1000, getMaximalIterationCount=100,...#292#-190956018", SearchInputFactory_scaffolding.receiverState());
 }
}
