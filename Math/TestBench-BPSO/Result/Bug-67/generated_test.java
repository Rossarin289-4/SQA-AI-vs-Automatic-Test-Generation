package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:4>", "1.7976931348623157E308", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "5983375963110961019"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.9833759631109612E18"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "-5.9833759631109612E18", "-Infinity", "4.294967294E9"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1073739775"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=1073739775, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#-492682309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "NaN", "1.0", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:7>", "-Infinity", "NaN", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:1>", "-Infinity", "1.0000000000000002"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<null>", "<sample:9>", "54.0", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:8>", "<sample:1>", "-Infinity", "-Infinity", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:4>", "-1.7976931348623157E308", "1.7976931348623155E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:6>", "1.7976931348623157E308", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.9833759631109606E17"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptim...#274#-1900714526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:7>", "<sample:5>", "Infinity", "Infinity", "0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "2147483647", "-Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=!, getOptim...#274#18446050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=!, getOptimaValues=!, getR...#253#-1481529540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"80"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:2>", "<sample:7>", "-2.4000000000000004", "NaN", "5.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=80, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], getOptimaV...#277#-371463758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:4>", "0.0", "-1.9999999999999998"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:0>", "NaN", "53.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=10, getOptima=!, getOptimaValues=!, getR...#253#1060669921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "5983375963110961019"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-45"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-45, getOptima=!, getOptimaValues=!, get...#254#-1970381046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:6>", "-Infinity", "-4.9E-324"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.1474836470629997E9"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:12>", "<null>", "-Infinity", "48.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "2147483602"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483602, getOptima=!, getOptima...#273#-1980721355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=10, getOptima=!, getOptimaValues=!, getR...#253#-266672575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<null>", "4.9E-324", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:5>", "1.0737418235E9", "4.294967294E8"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:0>", "Infinity", "Infinity", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-1073741823, getMaximalIterationCount=2147483647, getOptima=!, getOptim...#274#-299905163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:6>", "-1.7976931348623157E308", "1.0", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:5>", "4.9E-324", "5.3687091175E8", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.147483647072E9"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "-Infinity", "-0.5", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:0>", "<sample:1>", "-Infinity", "0.1", "-1.0"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<null>", "-Infinity", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:4>", "Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:7>", "5983375963110961019", "Infinity", "-5.9833759631109601E18"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-5.9833759631109612E18"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147418112"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147418112, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#272#1684385562", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "5.983375963110962E19", "0.0", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:0>", "<sample:0>", "1.7976931348623157E308", "-2.147483647E9"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:3>", "-5.9833759631109612E18", "-Infinity"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "4.9E-324", "1.34", "-1.7976931348623157E308"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:7>", "2.1474836494E10", "1.7976931348623157E308", "0.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:5>", "32.0", "NaN", "2147483647"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:2>", "4.294967294E8", "0.0", "4.294967294E9"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.03"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "2.1474837040000005E9", "NaN", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "131072"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=131072, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], getOpt...#281#1488680068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:7>", "-1.7976931348623157E308", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRe...#234#736683964", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:6>", "4.9E-324", "-1.7976931348623157E308"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:0>", "-Infinity", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.9916879815554806E19"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "1.1966751926221922E19", "1.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=45, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#253#1795798025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:1>", "<sample:3>", "-1.1966751926221922E19", "-1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-13"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=-13, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], getOptima...#278#-774221451", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0737418235E9"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:12>", "NaN", "-1.7976931348623157E308", "1.0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=1, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, ...#262#684200783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getRe...#252#-1603629196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValu...#264#501514246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:3>", "1.0", "31.0", "5983375963110961019"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=!, getOptimaValue...#262#1164972380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147418112"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147418112, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#262#465298442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:7>", "8.988465674311579E307", "1.0000000000000002", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-59"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-59, getOptima=!, getOptimaValues=...#266#-285677493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"33554481"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=33554481, getOptima=!, getOptimaValues=...#261#-1251539861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1, getOptima=!, getOptimaValues=!, getR...#253#1486095260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValu...#264#501514246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:10>", "<sample:9>", "-4.294967294E9", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:9>", "<sample:5>", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:6>", "-1.0", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpt...#276#-50458954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:4>", "<sample:5>", "5983375963110961019", "NaN", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "-Infinity", "1.7976931348623157E308"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:0>", "2.9916879815554806E18", "2147483647", "1.0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=1, getOptima=[-Infinity, -Infinity, -Infinity]...#304#-664948981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-41"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-41, getOptima=!, getOptimaValues=!, get...#254#-1913380466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2, getMaximalIterationCount=-2, getOptima=!, getOptimaValues=!, getRelative...#247#308863358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#254#-5082962", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:1>", "-2.147483647E9", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#272#-1232043578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.1474836527E9"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<null>", "4.294967294E9", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:7>", "-Infinity", "0.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:3>", "<sample:4>", "2.147483647047E9", "1.1966751926221922E19", "2.147483647E10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:5>", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2146959360"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2146959360, getOptima=!, getOptimaValue...#262#-1483314214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "-Infinity", "1.0000000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483590"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=-2147483590, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOp...#278#-1171491334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:3>", "-1.7976931348623155E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0, 1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-2.14748364648E9"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147418169"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147418169, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#262#982500524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:6>", "-1.7976931348623157E308", "NaN", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getOptima=[-Infinity, -Infinity, -Infinity]...#304#1944118380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-20"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-20, getOptima=!, getOptimaValues=!, ge...#256#-699236457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:6>", "-Infinity", "2.147483647E8", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=!, getOptimaValu...#264#796512006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=!, getOptimaValu...#264#796512006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-1.0000000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.1"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:6>", "Infinity", "-0.5"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=-2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOp...#278#1683790951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "-Infinity", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "-4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483594"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483594, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#262#-599270094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<null>", "<sample:3>", "0.9999999999999999", "-10.000000000000002", "-0.9800000000000001"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147418112"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=-2147418112, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOp...#278#-487125548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:4>", "2.1474836469999998E9", "2.9916879815554811E18", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:4>", "<sample:5>", "5983375963110961019", "4.294967294E9"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:2>", "NaN", "-Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -Infinity]...#304#-1019604776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:7>", "-0.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:1>", "Infinity", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:1>", "-1.0", "2147483647", "0.5"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:8>", "Infinity", "5.3687091175E8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:8>", "NaN", "2147483647"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:6>", "Infinity", "2147483647", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"58.0"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=1, getOptima=!, getOptimaValues=!, getRe...#252#110531431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483646, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#1098800819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-1073741838"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741838", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-1073741838, getMaximalIterationCount=2147483647, getOptima=!, getOptim...#274#-888544103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "4.294967303E9"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:7>", "<sample:7>", "1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:2>", "2147483647", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "0.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:5>", "Infinity", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:4>", "-Infinity", "-2.1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!ArrayIndexOutOfBoundsException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[], get...#285#-1812472160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:6>", "1.0", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:2>", "5983375963110961019", "2.1474836470000005E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:1>", "-1.0", "-Infinity", "4.9E-324"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "117"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=117, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], getOptima...#278#-125626447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:3>", "<sample:9>", "1.7976931348623157E308", "5983375963110961019", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"53"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=53, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#253#-393396090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:0>", "1.7976931348623157E308", "-1.0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<null>", "<sample:3>", "1.0", "0.9999999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:4>", "1.0000000000000002", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0, 1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:3>", "Infinity", "2.9916879815554806E18", "5.9833759631109612E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:9>", "-1.0", "2.1474836469999996E10", "Infinity"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "64"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=64, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#253#1617641638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<null>", "2147483647", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:0>", "Infinity", "2.0"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2.1474836469999998E9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:7>", "<sample:6>", "Infinity", "2.14748364735E9", "-1.0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"16385"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=16385, getOptima=!, getOptimaValues=!, ...#258#1877713751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getRe...#252#-1603629196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#262#-30730786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:8>", "<sample:4>", "2.147483638E9", "NaN", "5983375963110961019"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "-0.7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=-2147483648, getOptima=[Infinity, Infinity], g...#286#1700503360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:1>", "<sample:7>", "-0.9999999999999999", "NaN", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:1>", "<sample:7>", "-1.0", "2147483647", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:5>", "<sample:2>", "Infinity", "8.589934588E9"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:3>", "<sample:2>", "-2.147483627E9", "1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-1073741824"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-1073741824, getOptima=!, getOptimaValu...#264#-1395004198", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:0>", "<sample:7>", "1.7976931348623157E308", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483646"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", "double", "1.0000000000000004"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483646, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#1251510975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getOptima=!, getOptimaValues=!, getRe...#252#1926680902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:2>", "0.0", "-1.0", "-1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:9>", "<sample:3>", "23.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:7>", "1.7976931348623157E308", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:3>", "<sample:2>", "Infinity", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:5>", "4.9E-324", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<sample:1>", "0.0", "-5.300000000000001"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:6>", "<null>", "1.0", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:3>", "-5.9833759631109612E18", "-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-5.9833759631109612E18"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double"}, new String[]{"<sample:7>", "<sample:4>", "-38.0", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "65"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=65, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, get...#255#699129771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:3>", "-Infinity", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:9>", "<sample:4>", "-Infinity", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:5>", "<sample:5>", "NaN", "-8.988465674311579E306"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptima", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2145386495"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2145386495, getOptima=!, getOptimaValue...#263#1853292401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", "double", "2.147483647E9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=0, getOptima=!, getOptimaValues=!, getRe...#252#1926680902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=0, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getRe...#252#198270130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getFunctionValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:8>", "<sample:6>", "-Infinity", "-1.7976931348623157E308", "-1.0000000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:4>", "<sample:4>", "1.0E-323", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:10>", "<sample:3>", "1.7976931348623157E308", "1.7976931348623157E308", "-1.0"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:9>", "<null>", "-Infinity", "2.147483646E9", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=-2, getFunctionValue=Infinity, getIterationCount=-2, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[Infinity, Infinity], ge...#285#1410770388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:2>", "<sample:6>", "-1.7976931348623158E307", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "-11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=-11, getOptima=!, getOptimaValues=!, ge...#256#-331503495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:6>", "<sample:3>", "-Infinity", "NaN", "5983375963110961019"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=20, getFunctionValue=0.0, getIterationCount=20, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0, 0.0, 0.0, 0.0, 0.0], getOpti...#275#-1579254294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#262#-30730786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:6>", "<sample:9>", "5.9833759631109612E18", "Infinity", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:2>", "<sample:7>", "-Infinity", "-1.0000000000000002", "0.0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:5>", "<sample:0>", "NaN", "-4.9E-324", "-3.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptima...#273#-389680428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#2125749268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147417632"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147417632", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147417632, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValu...#264#-1306006218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValu...#264#501514246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues...#261#624774836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:9>", "<sample:5>", "2.0000000000000004", "5.9833759631109622E18"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=30, getFunctionValue=1.0, getIterationCount=30, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0], ge...#285#-2013888770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double", "double", "double"}, new String[]{"<sample:9>", "<sample:6>", "-Infinity", "Infinity", "5.9833759631109622E18"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValue=0.0, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[0.0], getOptimaValues=[0.0], getRel...#233#-1948328924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "3"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=-2147483648, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#262#-30730786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getMaximalIterationCount", ""}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaV...#271#1762095394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaximalIterationCount", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=10, getOptima=!, getOptimaValues=!, get...#255#-70132399", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double", "<sample:9>", "<sample:3>", "NaN", "-0.5"}, {"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValue=-Infinity, getIterationCount=6, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-Infinity, -Infinity, -...#313#-1769696994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getOptimaValues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValue...#263#-558392610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimize", "org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double", "<sample:0>", "<sample:6>", "-1.0", "4.9E-324", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=12, getFunctionValue=-1.0, getIterationCount=12, getMaxEvaluations=2147483647, getMaximalIterationCount=2147483647, getOptima=[-1.0, -1.0, -1.0, -1.0], getOpt...#277#447657012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "setMaxEvaluations", "int", "42"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValue=!NullPointerException, getIterationCount=0, getMaxEvaluations=42, getMaximalIterationCount=2147483647, getOptima=!, getOptimaValues=!, getR...#253#1890533478", SearchInputFactory_scaffolding.receiverState());
 }
}
