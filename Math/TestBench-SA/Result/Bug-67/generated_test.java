package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.0E-323"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<null>", "5983375963110961019", "5983375963110961019", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:4>", "-10.0", "NaN", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=110, getFunctionValue=1.0, getIterationCount=110, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1...#337#1896446690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getRe...#252#-275755853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getRe...#252#-2077655179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, ...#262#684200783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#254#1804820623", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, get...#255#1800736102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValu...#264#501514246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#254#-680243088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#254#-680243088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-8, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, get...#255#2016312895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-27"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "NaN", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=-27, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -Inf...#368#-2070451144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-17"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:3>", "NaN", "4.4942328371557893E307"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=-17, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -Inf...#368#-1102490215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:4>", "NaN", "4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infini...#376#-611000800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "5983375963110961019", "-4.4942328371557893E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0...#356#-576107264", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "2.9916879815554806E19", "-4.4942328371557893E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=-1073741824, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0...#356#-1572509740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "2.9916879815554806E19", "-4.4942328371557893E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=-1073741824, getMaximalIterationCount=10, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, ...#348#-1359367487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "2.9916879815554806E19", "-4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-17"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=-1073741824, getMaximalIterationCount=-17, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0,...#349#-1433112669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741762"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "2.9916879815554806E19", "-4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-17"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "5983375963110961019"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=-1073741762, getMaximalIterationCount=-17, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0,...#349#-2041018294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:4>", "-5.9833759631109612E18", "2.147483647E10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:2>", "NaN", "8.988465674311579E307", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "Infinity", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "NaN", "Infinity", "-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:4>", "Infinity", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.073741823511E9"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:3>", "NaN", "1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:3>", "4.4942328371557893E307", "1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:4>", "-4.4942328371557906E306", "-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:4>", "-4.4942328371557906E306", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinit...#375#-1349316932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:3>", "-8.988465674311581E306", "1.7976931348623157E308"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=56, getFunctionValue=-Infinity, getIterationCount=56, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity,...#373#680631406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:3>", "-8.988465674311583E306", "Infinity"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0,...#355#-1427726000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<null>", "Infinity", "Infinity"}, false, 16, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2048, getFunctionValue=0.0, getIterationCount=2048, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0,...#353#280081450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "Infinity", "Infinity"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "-0.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinit...#375#-1349316932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "Infinity", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:2>", "Infinity", "-0.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:0>", "Infinity", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:2>", "Infinity", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:1>", "<sample:2>", "Infinity", "-Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:5>", "-0.0", "1.7976931348623158E307"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=42, getFunctionValue=Infinity, getIterationCount=42, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, Inf...#369#-1363757898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:2>", "-0.0", "1.7976931348623157E308"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:4>", "5983375963110961019", "4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=132, getFunctionValue=Infinity, getIterationCount=132, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, I...#371#1053582856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "-1.0737418228150001E8", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "-2.14748492563E9", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:4>", "Infinity", "0.0"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-1.7976931348623158E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0,...#355#-1427726000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483646, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#1251510975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:6>", "-1.7976931348623155E308", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:6>", "0.0", "2.3933503852443845E19"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinit...#375#-1349316932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:6>", "-2.8", "2.3933503852443845E20"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:2>", "-0.2999999999999998", "2.3933503852443845E20"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:0>", "4.494232837155789E304", "2.1474836475377002E11"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=42, getFunctionValue=Infinity, getIterationCount=42, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, Inf...#369#-1363757898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:8>", "<sample:0>", "-4.494232837155789E304", "NaN"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=132, getFunctionValue=Infinity, getIterationCount=132, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, I...#371#1053582856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=!, getOptimaValues=!, get...#255#-1568904362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:0>", "4.49423283715579E303", "-1.0"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], g...#286#-872394034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:7>", "NaN", "1.0000000000000002"}, false, 16, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "-1.7976931348623157E308", "Infinity", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2048, getFunctionValue=0.0, getIterationCount=2048, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0,...#353#280081450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#254#1804820623", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=10, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, get...#255#-1774072757", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "Infinity", "5983375963110961019", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"536870945"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "NaN", "4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=536870945, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity...#374#-1295286169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"536870945"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "NaN", "4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=536870945, getMaximalIterationCount=2147483647, getOptima=[], getO...#284#2024204759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"536870945"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:4>", "NaN", "4.4942328371557893E307"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=536870945, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0, ...#354#-1937054329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:7>", "1.0", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:7>", "1.0", "4.294967294E9"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:7>", "1.0", "2.147483647E9"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-1"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=[-1.0, -1.0, -1.0, -1.0], getOptimaValue...#269#758991036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:7>", "1.0", "2.147483647E9"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=-2, getOptima=[-1.0, -1.0, -1.0, -1.0], getOptimaValue...#269#1881270235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:6>", "1.0", "2.14748364719E9"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-14"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:0>", "1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=-14, getOptima=[-1.0, -1.0, -1.0, -1.0], getOptimaValu...#270#541356146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:6>", "1.0", "2.14748364719E9"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-131086"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=-131086, getOptima=[-1.0, -1.0, -1.0, -1.0], getOptima...#274#-664754794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:3>", "5983375963110961019", "-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "NaN", "0.0", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:0>", "-1.0", "4.4942328371557893E307"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.034"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<null>", "<sample:1>", "0.0", "NaN", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.196675192622192E19"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:1>", "0.0", "4.4942328371557893E307", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "5983375963110961019", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-12.72"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:1>", "0.0", "4.4942328371557893E307", "-8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"4.269"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:4>", "NaN", "1.0", "-1.7976931348623157E308"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:2>", "NaN", "8.988465674311579E307", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "Infinity", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValu...#264#501514246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:4>", "<sample:4>", "NaN", "Infinity", "-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:4>", "Infinity", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-27"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-27, getOptima=!, getOptimaValues=!, ge...#256#503449374", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"8"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=8, getOptima=!, getOptimaValues=!, getR...#254#2121814628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=!, getOptimaValues=!, get...#255#-1568904362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2, getOptima=!, getOptimaValues=!, get...#255#-2010658857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=!, getOptimaValues=!,...#263#-1489713254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "0.0", "-Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "1.19667519262219213E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=132, getFunctionValue=Infinity, getIterationCount=132, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, I...#371#1053582856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:2>", "0.0", "-Infinity"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "1.19667519262219213E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=110, getFunctionValue=1.0, getIterationCount=110, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1...#337#1896446690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:4>", "1.7976931348623157E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:2>", "1.0", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=1, getOptima=!, getOptimaValues=!, getR...#254#919128797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "1.0", "4.4942328371557893E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:4>", "0.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:2>", "<sample:6>", "NaN", "0.0"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:2>", "-1.7976931348623157E308", "Infinity", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=132, getFunctionValue=Infinity, getIterationCount=132, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, I...#371#1053582856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:5>", "2147483647", "0.0"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:2>", "-1.7976931348623157E308", "Infinity", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=110, getFunctionValue=1.0, getIterationCount=110, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1...#337#1896446690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:6>", "0.0", "0.0", "5983375963110961019"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, get...#255#1800736102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:6>", "1.1966751926221922E19", "-1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=110, getFunctionValue=1.0, getIterationCount=110, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, ...#338#-444633666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:1>", "1.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getOptima=!, getOptimaValues=!, getR...#254#1360883292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getOptima=!, getOptimaValues=!, getR...#254#1360883292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "2147483647", "4.4942328371557893E307", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=!, getOptimaValues=!, get...#255#-1568904362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:3>", "-1.0", "1.7976931348623157E308", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:3>", "1.7976931348623157E308", "4.4942328371557893E307", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:4>", "8.98846567431158E307", "1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:7>", "-1.7976931348623157E308", "-4.4942328371557893E307", "-1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "Infinity", "0.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, get...#255#1800736102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:3>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:3>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=42, getFunctionValue=Infinity, getIterationCount=42, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, Inf...#369#-1363757898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=56, getFunctionValue=-Infinity, getIterationCount=56, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity,...#373#680631406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=72, getFunctionValue=-1.0, getIterationCount=72, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0, -...#337#-1459064776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=90, getFunctionValue=0.0, getIterationCount=90, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0...#325#-348780558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=110, getFunctionValue=1.0, getIterationCount=110, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1...#337#1896446690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "NaN", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=132, getFunctionValue=Infinity, getIterationCount=132, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, I...#371#1053582856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinit...#375#-1349316932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0...#356#1201237345", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2048, getFunctionValue=0.0, getIterationCount=2048, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0...#354#1934756359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=6400, getFunctionValue=1.0, getIterationCount=6400, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0...#354#-1464153009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=6400, getFunctionValue=1.0, getIterationCount=6400, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0...#354#-1464153009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25500", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=25500, getFunctionValue=Infinity, getIterationCount=25500, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=?, getOptimaValue...#254#1893304197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65280", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=65280, getFunctionValue=-Infinity, getIterationCount=65280, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=?, getOptimaVal...#258#-1452544701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:6>", "NaN", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65280", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=65280, getFunctionValue=-Infinity, getIterationCount=65280, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483647, getOptima=?, getOptimaVal...#258#-1452544701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "5983375963110961019"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-5, getOptima=!, getOptimaValues=!, get...#255#959044954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"35"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "5983375963110961019"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=35, getOptima=!, getOptimaValues=!, get...#255#397087508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"17"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "5983375963110961019"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=17, getOptima=!, getOptimaValues=!, get...#255#1132553432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "5983375963110961019"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2, getOptima=!, getOptimaValues=!, get...#255#-2010658857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"32"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=32, getOptima=!, getOptimaValues=!, get...#255#1722350993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-27"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-27, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, ge...#256#-1957552402", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483600"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-27"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-27, getMaximalIterationCount=2147483600, getOptima=!, getOptimaValues=!, ge...#256#77711595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "0.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-27"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-27, getMaximalIterationCount=-2147483648, getOptima=!, getOptimaValues=!, g...#257#372231414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<null>", "2147483647", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25500", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=25500, getFunctionValue=Infinity, getIterationCount=25500, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=?, getOptimaValues...#253#1058491940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.4100000000000001"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"10.0"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:5>", "NaN", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=42, getFunctionValue=Infinity, getIterationCount=42, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, Inf...#369#-1363757898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=110, getFunctionValue=1.0, getIterationCount=110, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1...#337#1896446690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "2.147483647E10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=132, getFunctionValue=Infinity, getIterationCount=132, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity, I...#371#1053582856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "2.147483647E10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinit...#375#-1349316932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "2.147483647E10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0,...#355#-1427726000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "2.147483647E10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2048, getFunctionValue=0.0, getIterationCount=2048, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0,...#353#280081450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "2.147483647E10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=6400, getFunctionValue=1.0, getIterationCount=6400, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0,...#353#-229402590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:4>", "NaN", "-2.147483647E10"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=25500, getFunctionValue=Infinity, getIterationCount=25500, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=?, getOptimaValues...#253#1058491940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<null>", "-1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-17"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-17, getOptima=[], getOptimaV...#278#-1283498249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "NaN", "2147483647", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:4>", "NaN", "2147483647", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:2>", "1.7976931348623157E308", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:7>", "NaN", "4.4942328371557893E307", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<null>", "1.7976931348623157E308", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "-1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "-1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "-1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getOptima=!, getOptimaValues=!, getRe...#252#1926680902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<null>", "2147483647", "2147483647", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "0.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:6>", "5983375963110961019", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "0.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:6>", "5983375963110961019", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=56, getFunctionValue=-Infinity, getIterationCount=56, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity,...#373#680631406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getRe...#252#198270130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=192, getFunctionValue=-Infinity, getIterationCount=192, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinit...#375#-1349316932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("512", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=512, getFunctionValue=-1.0, getIterationCount=512, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0, -1.0,...#355#-1427726000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2048, getFunctionValue=0.0, getIterationCount=2048, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0,...#353#280081450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6400", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=6400, getFunctionValue=1.0, getIterationCount=6400, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0,...#353#-229402590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25500", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=25500, getFunctionValue=Infinity, getIterationCount=25500, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=?, getOptimaValues...#253#1058491940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65280", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=65280, getFunctionValue=-Infinity, getIterationCount=65280, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=?, getOptimaValu...#257#1725849534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=256000, getFunctionValue=-1.0, getIterationCount=256000, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=?, getOptimaValues=?, ge...#239#-956267794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-20, getFunctionValue=Infinity, getIterationCount=-20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ...#287#-1567107780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:5>", "NaN", "8.988465674311579E307", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483632"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483632, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#173627010", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147467263"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147467263, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-686850770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147467261"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147467261, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-1362010896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-27"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-27, getOptima=!, getOptimaValues=!, ge...#256#503449374", SearchInputFactory_scaffolding.receiverState());
 }
}
