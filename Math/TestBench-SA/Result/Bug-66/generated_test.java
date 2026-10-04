package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:3>", "Infinity", "-1.7976931348623157E308", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:4>", "0.0", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100, g...#283#379321629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "Infinity", "-1.7976931348623157E308", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:0>", "10.0", "1.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<null>", "1.9460000000000002", "0.25"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:14>", "<sample:7>", "-1.0009999999999997", "10.739999997500002"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:14>", "<sample:1>", "-1.7976931348623157E308", "1.0E-11", "1.0E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.739999982595153", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-10.739999982595153, getGoalType=MINIMIZE, getIterationCount=42, getMax=10.739999997500002, getMaxEvaluations=1000, getMaximalIteratio...#330#-1475642011", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:18>", "<sample:5>", "-1.7976931348623157E308", "-1735.6199994999993"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:18>", "<sample:2>", "Infinity", "3.4000000000000012", "19.46"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#361220425", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "1.0E-11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#262#232850221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.05, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#1258495919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.1, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#1352006115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.1, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#682148076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.8, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#-1163289449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "Infinity"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.8, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#955761526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "2.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=2.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#658141113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-491691174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "1.0000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.0000000000000002, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0...#276#281172900", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "NaN", "-1.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:0>", "-1.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=0, getMax=-1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=NaN, ge...#269#1650187598", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=3.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#-837471838", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=-1, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-1987852159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:4>", "-1.0", "-1.7976931348623157E308", "5.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:4>", "0.0", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=44, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100,...#281#1358234482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:4>", "Infinity", "-1.7976931348623157E308", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:4>", "0.0", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100, g...#283#944780975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:4>", "Infinity", "-1.7976931348623157E308", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:4>", "0.0", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100, ...#284#1767808470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:4>", "Infinity", "5.0", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:4>", "0.0", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=5.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity, get...#264#-2145234512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "Infinity", "-1.7976931348623157E308", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:0>", "10.0", "1.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100, ...#284#1202349124", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "Infinity", "4.73", "11.220000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "2.0", "1.0E-9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0119598984178842E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=53, getFunctionValue=1.0, getGoalType=null, getIterationCount=52, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0, getRelat...#280#-2000851148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:2>", "2.0", "1.0E-9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0119598984178842E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=53, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=52, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0, getR...#284#801676943", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:3>", "5.0", "0.5", "1.0E-9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MINIMIZE, getIterationCount=0, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0, getRelati...#265#-336152466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:3>", "5.0", "0.5", "1.0E-9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MINIMIZE, getIterationCount=0, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=5.0, getRelative...#263#-1741002515", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "-1"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-1, getMin=0.0, getRelativeAcc...#260#-872669284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "NaN"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1498354994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"65"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=65, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#1970958939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"81"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=81, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-852298987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-943"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-943, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1600506169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1886"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-1886, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#-1153085306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1902"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-1902, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#-416627317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.5", "-1.0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#259#1732226562", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "-0.10000000000000009", "-1.0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#276#-1926565581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "0.059999999999999915", "-1.0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#276#1435285771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "1.0", "1.0E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0, getR...#284#845632134", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:2>", "1.0", "1.0E-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0...#290#-1140896925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:2>", "1.0", "1.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=2, getMaximalIterationCount=100, getMin=1.0, g...#287#-1975034012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:3>", "1.0", "1.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=2, getMaximalIterationCount=100, getMin=1.0, g...#287#1102110646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:3>", "2.0", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=0, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0...#281#1423649574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:3>", "2.0", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0, getR...#275#1873860617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.0", "Infinity", "5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=Infinity, getGoalType=null, getIterationCount=5, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelat...#250#-1437131612", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.0", "Infinity", "5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=Infinity, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelat...#250#-1262424353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=2147483647, getMin=0.0, getRel...#268#426950436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1073741823"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=1073741823, getMin=0.0, getRel...#268#1972561656", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#269#19225892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=2147483647, getMin=0.0, getRelativ...#264#1891861819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-1, getMin=0.0, getRelativeAccurac...#256#994307251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"61"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=61, getMin=0.0, getRelativeAccurac...#256#851157194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"3"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=3, getMin=0.0, getRelativeAccuracy...#255#-1857412730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"50.7"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=50.7, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#1379769855", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"47.1"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=47.1, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#262#-225647523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"47.10000000000001"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=47.10000000000001, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0,...#275#-661315358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"47.10000000000001"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=47.10000000000001, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#271#624206571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"4.710000000000001"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=4.710000000000001, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#271#-1690021447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"5.200000000000001"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=5.200000000000001, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#271#1965075516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"5.200000000000002"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=5.200000000000002, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#271#-219200421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"5.200000000000002"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValue=5.200000000000002, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#271#681867514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-585946518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#361220425", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.49999999999999994"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#274#319628867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.9999999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#273#-310585444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#282537507", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.1, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#1352006115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.05, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#1258495919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=2.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#658141113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "4"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308", "Infinity", "1.0E-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=Infinity, getMaxEvaluations=4, getMaximalIterationCount=100, getMin=1.7976931348...#281#-973398037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308", "Infinity", "1.0E-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.7976931...#284#1098519182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.5", "1.7976931348623157E308", "5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.7976931348623157E308, getGoalType=null, getIterationCount=5, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin...#267#-1385861232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308", "Infinity", "1.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=2, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.7976931...#284#683192365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0E-9", "1.0E-11", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.0E-11, getGoalType=null, getIterationCount=2147483647, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ...#264#1543275377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:7>", "NaN", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308", "Infinity", "1.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=2, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.79769313486...#280#-2130679740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308", "Infinity", "2.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=2, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.7976931...#284#1570696046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:3>", "1.0E-9", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MINIMIZE, getIterationCount=0, getMax=2.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-9, getRel...#277#-401696710", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "NaN", "-1.0", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#272#122847271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "NaN", "-1.0", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-1.0, getGoalType=null, getIterationCount=-2147483647, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#272#1007583078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:4>", "-1.0", "-1.7976931348623157E308", "5.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:4>", "0.0", "3.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=44, getMax=-1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100,...#281#1358234482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-1, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-1285256320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "Infinity", "-1.7976931348623157E308", "10.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:0>", "10.0", "1.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "Infinity", "4.73", "11.220000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=1, getMax=4.73, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinit...#284#1701442451", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "Infinity", "4.73", "11.220000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=4.73, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity, get...#278#748682384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "Infinity", "5.07", "11.220000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=5.07, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity, ge...#279#-588516972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "Infinity", "29.07", "11.220000000000002"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=29.07, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity, g...#280#309298066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<null>", "Infinity", "29.07", "11.220000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=-1.0, getGoalType=null, getIterationCount=1, getMax=29.07, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity, getRe...#276#-1519033911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<null>", "1.7976931348623157E308", "29.07", "11.220000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=-1.0, getGoalType=null, getIterationCount=44, getMax=29.07, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.79769313486...#292#-1768977871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:6>", "1.0E-9", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("101", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=102, getFunctionValue=NaN, getGoalType=MAXIMIZE, getIterationCount=101, getMax=1.7976931348623157E308, getMaxEvaluations=1000, getMaximalIterationCount=100...#309#425910762", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.0", "1.0E-11", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.0E-11, getGoalType=null, getIterationCount=5, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelati...#252#-1290771923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<null>", "2.0", "1.0E-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0119598984178842E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=53, getFunctionValue=1.0, getGoalType=null, getIterationCount=52, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0, getRelat...#280#-2000851148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:3>", "5.0", "0.5", "1.0E-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MINIMIZE, getIterationCount=0, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0, getRelati...#265#-336152466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#379070652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=2, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#-505665155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-692293351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"56"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=56, getMin=0.0, getRelativeAcc...#260#-1734618406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-56"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-56, getMin=0.0, getRelativeAc...#261#-1850785673", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-28"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-28, getMin=0.0, getRelativeAc...#261#-1142146788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "10.0", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=10.0, getGoalType=null, getIterationCount=10, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelative...#255#1164621918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "100.0", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=100.0, getGoalType=null, getIterationCount=10, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativ...#256#2086355494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "-100.0", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-100.0, getGoalType=null, getIterationCount=10, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelati...#257#875959843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:2>", "1.5", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:3>", "1.5", "1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.7976931348623157E308, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin...#280#-1623234061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-526595762", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"29.07"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#260#208334529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"64.07"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#260#1545253098", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"16.0175"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#262#445880251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"16.077499999999997"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#273#920066695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "11.220000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#273#-876885119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.0E-11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.967"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.967, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-1911355526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.934"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.934, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#-177716871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=5, getMin=0.0, getRelativeAccu...#259#-2134182017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=10, getMin=0.0, getRelativeAcc...#260#-1028143337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=Infinity, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelat...#266#-1951737765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.7976931348623157E308, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin...#280#-1623234061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.7976931348623157E308", "NaN", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=6, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#267#-1260068859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.7976931348623157E308", "NaN", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=NaN, getGoalType=null, getIterationCount=6, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#263#2112322318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-2147483648, getMaximalIterationCount=100, getMin=0.0, getRel...#268#-799117170", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=3, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#957156071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"65"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=65, getMaximalIterationCount=100, getMin=0.0, getRelativeAccu...#259#1970958939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getMin=0.0, getRelati...#265#751507143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "29.07"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#260#208334529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-29.07"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-877878818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-2.907"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1168619756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "29.07"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-424245786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "NaN", "0.5", "0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.5, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#248#-1607730730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=2147483647, getMaximalIterationCount=100, getMin=0.0, getRela...#267#695365640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#-1775742045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#1634489444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:2>", "1.0", "1.0E-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0...#290#-1140896925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "1.0", "1.0E-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0, getR...#284#845632134", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:3>", "1.0", "1.0E-9"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=51, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=50, getMax=1.0E-9, getMaxEvaluations=2, getMaximalIterationCount=100, getMin=1.0, g...#287#1102110646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=6, getMin=0.0, getRelativeAccu...#259#1072822657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "-55"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#269#19225892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#-547149723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=1.5, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1471831029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"2.9999999999999996"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=2.9999999999999996, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0...#276#-414243894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"0.29999999999999993"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.29999999999999993, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#277#460807039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"0.31899999999999995"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.31899999999999995, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#277#-1400086539", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"2.600000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.4"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValue=2.600000000000001, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, get...#271#-65123846", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.4"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValue=-1.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#-916709931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "8.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=8.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#258#1948034548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-8.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-8.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeA...#259#-1601016143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-80.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=-80.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelative...#260#1522730721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "11.220000000000002", "11.220000000000002", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.220000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=11.220000000000002, getGoalType=null, getIterationCount=4, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0...#278#1781075332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.5"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.5, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#-807864440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.5"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.5, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#76871367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.5"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#864366175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=0, getMin=0.0, getRelativeAccu...#259#-207348102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "1.0E-9", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=41, getMax=-1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-...#290#624897963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "1.0E-9", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=41, getMax=-1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-...#290#624897963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "-1.7976931348623157E308", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=88, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=86, getMax=1.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.797693134...#299#-1161702040", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:7>", "10.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5920145221353843E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=56, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=55, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=10.0, getRel...#274#-949201689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "10.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5920145221353843E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=56, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=55, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=10.0, getRel...#274#1560149241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "-10.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.999999988159347", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-10.0, getRe...#272#568515517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "-10.0", "-0.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.999999989907401", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-10.0, getR...#273#-1543404217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "-28.0", "-0.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-27.999999968576226", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-28.0, getR...#275#-1775312610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:8>", "1.0E-11", "-0.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7999999990619479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, ge...#287#1030888060", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<null>", "1.0E-11", "-0.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7999999990619479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=null, getIterationCount=41, getMax=-0.8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, getRel...#283#-579781705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<null>", "1.0E-11", "-0.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7999999990619479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=null, getIterationCount=41, getMax=-0.8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, getRel...#283#-579781705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<null>", "1.0E-11", "-0.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7999999990619479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=0.0, getGoalType=null, getIterationCount=41, getMax=-0.8, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, getRel...#283#-1845852490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<null>", "1.0E-11", "-0.4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3999999995359739", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=0.0, getGoalType=null, getIterationCount=41, getMax=-0.4, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, getRel...#283#-511304465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:2>", "1.0E-11", "-0.4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3999999995359739", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.4, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, ge...#287#-170171340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:5>", "1.0E-11", "-0.4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3999999995359739", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=41, getMax=-0.4, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, g...#288#38714732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:2>", "1.0E-11", "-0.4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "1.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3999999995359739", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.4, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, g...#288#776356506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:2>", "1.0E-11", "-0.35700000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.35699999958693174", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-0.35700000000000004, getMaxEvaluations=1000, getMaximalIterationCount=1...#315#579396099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "1.0E-11", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "1.0E-11", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:2>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0E-11, ...#271#1656819069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "5.0E-12", "1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:6>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.5E-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0E-12, g...#268#29002218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "5.0E-12", "1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:6>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.5E-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=5.0E-12, g...#268#29002218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "0.3050000000025", "1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:6>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2953596942174182E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=48, getMax=1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.305000...#302#-1629822546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "0.3050000000025", "1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:6>", "-36.5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2953596942174182E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=48, getMax=1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#308#-1863653716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "0.3050000000025", "1.0E-11"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:5>", "-36.49999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2953596942174182E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=48, getMax=1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#308#-1863653716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "0.3050000000025", "2.0E-11"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:5>", "-36.49999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.29535969314216E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=48, getMax=2.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#306#-1261395060", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "0.3050000000025", "0.5"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:5>", "-72.99999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3050000003769243", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=41, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=40, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.3050...#303#-114952262", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "0.30500000000249994", "0.5"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:5>", "-72.99999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.30500000037692426", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=41, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=40, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.3050...#308#845063879", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:5>", "0.30500000000249994", "0.09999999999999998"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:5>", "-72.99999999999999"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10000000016684112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=42, getMax=0.09999999999999998, getMaxEvaluations=1000, getMaximalIterationCount=10...#324#816025661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "0.30500000000249994", "0.04999999999999999"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05000000007153509", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=44, getMax=0.04999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#318#-1241822397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "-1.0949999999975002", "0.04999999999999999"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0949999986006007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=41, getMax=0.04999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#318#-1946045206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "-10.949999999975002", "0.04999999999999999"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.949999986899284", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=41, getMax=0.04999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#317#-210399198", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "-10.903999999975003", "0.04999999999999999"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.903999986953801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=41, getMax=0.04999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#317#-1680719784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<null>", "-10.903999999975003", "0.04999999999999999"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.903999986953801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=null, getIterationCount=41, getMax=0.04999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=...#313#446466305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<null>", "-10.903999999975003", "0.4999999999999999"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.90399998597052", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=null, getIterationCount=41, getMax=0.4999999999999999, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-...#312#156976425", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<null>", "-10.903999999975003", "1.0E-11"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.903999987063052", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=null, getIterationCount=41, getMax=1.0E-11, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-10.90399999...#301#-1320152984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<null>", "0.0", "-1.0", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:3>", "29.07"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:1>", "11.820000000000002", "-0.5235", "8.988465674311579E307"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:1>", "-1.7976931348623157E308", "-0.5235000000000001", "8.988465674311579E307"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=-0.5235000000000001, getMaxEvaluations=1000, getMaximalIterationCount=100, getMi...#312#985697590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:1>", "1.7976931348623157E308", "-0.5235000000000001", "29.07"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=44, getMax=-0.5235000000000001, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#296#1867867107", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:1>", "Infinity", "-0.26175000000000004", "29.07"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=1, getMax=-0.26175000000000004, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#281#3650474", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:0>", "Infinity", "-0.26175000000000004", "29.07"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=-0.26175000000000004, getMaxEvaluations=1000, getMaximalIterationCount=100, getM...#281#-898553412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:0>", "Infinity", "-0.26175", "29.07"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=-0.26175, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=Infinity,...#269#-1066986176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:0>", "Infinity", "-0.026174999999999997", "29.07"}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=2, getFunctionValue=0.0, getGoalType=MAXIMIZE, getIterationCount=1, getMax=-0.026174999999999997, getMaxEvaluations=1000, getMaximalIterationCount=100, get...#282#-2125770635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:3>", "-1.0", "1.9", "29.106000000000005"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.999999998269153", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=49, getMax=1.9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, getRel...#285#1713977487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:3>", "-1.0", "1.9", "29.10600000000001"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.999999998269153", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=49, getMax=1.9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, getRe...#285#-142834743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:3>", "-1.0", "1.9", "2.0"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999980872197", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=-1.0, getGoalType=MINIMIZE, getIterationCount=44, getMax=1.9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, getRe...#272#-925872561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:2>", "-1.0", "1.9", "20.0"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999980465037", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=48, getMax=1.9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, getRe...#273#-1201348220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<null>", "-1.0", "-1.9", "20.000000000000007"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.899999996703713", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=48, getFunctionValue=-1.0, getGoalType=null, getIterationCount=47, getMax=-1.9, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, getRelat...#283#-978562823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<null>", "1.0", "-0.95", "20.000000000000007"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-5.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9499999990111548", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=1.0, getGoalType=null, getIterationCount=49, getMax=-0.95, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0, getRelati...#283#-1348169295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "1.0", "-0.95", "20.003000000000007"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-5.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9499999990108758", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=49, getMax=-0.95, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=1.0, getRe...#287#2041648506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:3>", "0.9999999999999999", "-0.95", "15.703000000000007"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setFunctionValue", "double", "-5.0"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9499999984534672", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=49, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=48, getMax=-0.95, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.99999999...#302#-105014074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "6"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=6, getMin=0.0, getRelativeAccu...#257#1978408776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "6"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=6, getMin=0.0, getRelativeAccu...#257#-1183367927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "6"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=6, getMin=0.0, getRelativeAccu...#257#806421388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "6"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=6, getMin=0.0, getRelativeAccu...#256#-1073399552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=-2147483648, getMin=0.0, getRe...#266#95615708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "29.07", "-1.7976931348623157E308", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=-1.7976931348623157E308, getGoalType=null, getIterationCount=3, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0....#266#660555363", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaximalIterationCount", "int", "5"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "29.07", "-1.7976931348623157E308", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=-1.7976931348623157E308, getGoalType=null, getIterationCount=3, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=5, getMin=0.0,...#264#1570409503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.0E-9"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1203513958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:1>", "1.5", "3.0", "-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setResult", "double,double,int", "1.0", "29.07", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=29.07, getGoalType=null, getIterationCount=-2147483648, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, g...#260#2128710427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "29.07"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:0>", "1.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "11.220000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=11.220000000000002, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, ge...#272#-1563711091", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<null>", "1.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "11.220000000000002"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#1768708028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:11>", "<sample:2>", "2.9000000000100004", "-2.85"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.899999995210932", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-1.0, getGoalType=MAXIMIZE, getIterationCount=42, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.9000000...#302#870052089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:11>", "<null>", "2.9000000000100004", "-2.85"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.899999995210932", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=-1.0, getGoalType=null, getIterationCount=42, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.90000000001...#298#1995174132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:2>", "2.9000000000100004", "-2.85"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.899999995210932", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=42, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.90000000...#301#1689347126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:3>", "2.9000000000100004", "-2.85"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.899999995210932", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.90000000...#301#-782661752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:3>", "3.0100000000100002", "-2.85"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.8499999951091235", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=42, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=3.01000000...#303#594944789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:3>", "3.0100000000100002", "Infinity"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=1.0, getGoalType=MINIMIZE, getIterationCount=0, getMax=Infinity, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=3.0100000...#282#-1910554326", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "3.0100000000100002", "-2.85"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.8499999951091235", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=43, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=42, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=3.01000000...#303#1078561859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "-2.0", "-2.85"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.849999995137511", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=39, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=38, getMax=-2.85, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-2.0, getR...#275#-844845488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "-2.0", "-5.7"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.699999992628613", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=41, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=40, getMax=-5.7, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-2.0, getRe...#273#128852333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "-2.0", "-11.4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-11.399999979460388", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=41, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=40, getMax=-11.4, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-2.0, getR...#274#1830610798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "-0.19999999999999998", "-11.4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.2000000003109323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=50, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=49, getMax=-11.4, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.1999999...#304#571956887", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:10>", "<sample:6>", "-0.19999999999999998", "-114.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-113.99999986534958", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=42, getFunctionValue=1.0, getGoalType=MAXIMIZE, getIterationCount=41, getMax=-114.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.199999...#292#2053489559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:6>", "-0.19999999999999998", "1.0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.19999999961744394", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=44, getMax=1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.199...#294#990960487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:6>", "-0.09999999999999999", "1.0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.09999999978327007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=46, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=45, getMax=1.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-0.099...#310#-807802000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#-2055638939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "-127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=-127, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-729436667", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "5.0", "10.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setAbsoluteAccuracy", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=0, getMax=10.0, getMaxEvaluations=1000, getMaximalIterationCount=100,...#314#-264694650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"83886081"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:7>", "1.0E-11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=83886081, getMaximalIterationCount=100, getMin=0.0, getRelati...#265#1940211690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-83886081"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:7>", "1.0E-11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=-83886081, getMaximalIterationCount=100, getMin=0.0, getRelat...#266#-1399468753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-41943040"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:7>", "1.0E-11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=-41943040, getMaximalIterationCount=100, getMin=0.0, getRelat...#266#-1624184846", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-41943017"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:7>", "1.0E-11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=-41943017, getMaximalIterationCount=100, getMin=0.0, getRelat...#266#1969615900", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-41943072"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "org.apache.commons.math.analysis.UnivariateRealFunction,double", "<sample:7>", "1.0E-11"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=1, getMax=0.0, getMaxEvaluations=-41943072, getMaximalIterationCount=100, getMin=0.0, getRelat...#266#1897141009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "2.0", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=NaN, getGoalType=MAXIMIZE, getIterationCount=1, getMax=0.5, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=2.0, getRelati...#266#57831956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "-1.0", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=-Infinity, getGoalType=MINIMIZE, getIterationCount=44, getMax=3.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, ...#277#1899238514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:7>", "-1.0", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=45, getFunctionValue=0.0, getGoalType=MINIMIZE, getIterationCount=44, getMax=3.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=-1.0, getRel...#271#-1434488785", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1, getMaximalIterationCount=100, getMin=0.0, getRelativeAccur...#258#-2055638939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "1.9460000000000002", "0.25"}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=0, getMax=1.9460000000000002, getMaxEvaluations=1000, getMaximalIterationCount=0, ge...#273#26942063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "1.9460000000000002", "0.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=-Infinity, getGoalType=MAXIMIZE, getIterationCount=0, getMax=1.9460000000000002, getMaxEvaluations=1000, getMaximalIterationCount=100, ...#275#-1742861746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.univariate.BrentOptimizer", "resetIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAccura...#257#400174276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "clearResult", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=0, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#-1641523461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.univariate.BrentOptimizer", "org.apache.commons.math.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"<sample:2>", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-11, getEvaluations=1, getFunctionValue=0.0, getGoalType=null, getIterationCount=0, getMax=0.0, getMaxEvaluations=1000, getMaximalIterationCount=100, getMin=0.0, getRelativeAc...#261#477527514", SearchInputFactory_scaffolding.receiverState());
 }
}
