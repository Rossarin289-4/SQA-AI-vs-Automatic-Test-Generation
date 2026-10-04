package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:6>", "-1.0", "9.999999999999997E-7", "Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.139259314057034E-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999997E-7, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=Infi...#205#-1228137245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"4", "<sample:10>", "-1.0000000000000002", "9.999999999999995E-7", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1403181052411018E-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999995E-7, getMaxEvaluations=4, getMin=-1.0000000000000002, getRelativeAccuracy=1.0E-14, getStartValu...#223#697139948", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:10>", "-2.0000000000000004E-7", "4.000000000000001E-7", "3.999999999999999E-6", "<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0000000000000004E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=4.000000000000001E-7, getMaxEvaluations=2147483647, getMin=-2.0000000000000004E-7, getRelativeAccuracy=1.0, ge...#233#-985814365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483595", "<sample:4>", "-2.000000000000001E-8", "0.5", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6629689564572345E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483595, getMin=-2.000000000000001E-8, getRelativeAccuracy=1.0E-14, getStartValue=0.24...#207#-1048708138", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"21", "<sample:6>", "-0.052000000000000005", "3.999999999999999E-7", "Infinity", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.411615771654508E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=3.999999999999999E-7, getMaxEvaluations=21, getMin=-0.052000000000000005, getRelativeAccuracy=1.0E-14, getStartV...#214#-1428504976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"53", "<sample:12>", "-0.5000000000000001", "1.0", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-0.5000000000000002", "-0.1", "2.0E-6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.13169104058930947", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=1.0, getMaxEvaluations=53, getMin=-0.5000000000000001, getRelativeAccuracy=1.0, getStartValue=0.249999999999...#205#-2103715207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"21", "<sample:4>", "-34.6", "2.000000000000001E-7", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-34.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=2.000000000000001E-7, getMaxEvaluations=21, getMin=-34.6, getRelativeAccuracy=1.0E-14, getStartValue=-17.2999999...#201#-1190570593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-4.0000000000000014E-7", "4.0000000000000003E-7", "<sample:10>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=4.0000000000000003E-7, getMaxEvaluations=2147483647, getMin=-4.0000000000000014E-7, getRelativeAccuracy=Infinity...#239#-1365061590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "-4.0000000000000003E-7", "0.5", "0.49999999999999994", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:10>", "1.0", "2.0E-6", "-4.9E-324", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "16", "<sample:6>", "-2.0000000000000007E-7", "1.7976931348623153E308", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.3259332943866866E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=-4.0000000000000003E-7, getRelativeAccuracy=1.0E-14, getStartValue=0.4...#217#156635528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"53", "<sample:7>", "-0.08999900000000001", "-2.000000000000001E-7", "-0.044999500000000005", "<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "134512650", "<sample:4>", "-6.4", "2.0", "-0.3299996", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.08999900000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-2.000000000000001E-7, getMaxEvaluations=53, getMin=-0.08999900000000001, getRelativeAccuracy=1.0E-14, getStartValu...#224#-1300782432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741812", "<sample:10>", "-0.044999500000000005", "1.0000000000000002E-7", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002E-7, getMaxEvaluations=1073741812, getMin=-0.044999500000000005, getRelativeAccuracy=1.0E-14, ...#225#-2067686033", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"53", "<sample:12>", "-1.0", "3.999999999999999E-7", "8.000000000000002E-7", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "9.999999999999997E-7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.594883371504221E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=3.999999999999999E-7, getMaxEvaluations=53, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=8.0000000000...#209#1927951265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "-33.0", "4.000000000000001E-7", "1.7976931348623155E308", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.000000011217253E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1320, getFunctionValueAccuracy=1.0E-15, getMax=4.000000000000001E-7, getMaxEvaluations=2147483647, getMin=-33.0, getRelativeAccuracy=1.0E-14, getStartValue=...#223#2039257527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:12>", "-33.00000000000001", "1.9999999999999995E-6", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.7697688542872E-21", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1479, getFunctionValueAccuracy=1.0E-15, getMax=1.9999999999999995E-6, getMaxEvaluations=2147483647, getMin=-33.00000000000001, getRelativeAccuracy=1.0E-14, ...#234#1870558512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"26", "<sample:4>", "-4.0000000000000014E-7", "1.9999999999999995E-6", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:1>", "0.0", "-0.2", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0000000000000014E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.9999999999999995E-6, getMaxEvaluations=26, getMin=-4.0000000000000014E-7, getRelativeAccuracy=1.0E-14, getStar...#228#-1901399366", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483647", "<sample:5>", "0.5", "-4.9E-324", "-1.7976931348623157E308", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "4.9E-324", "-1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483592", "<sample:0>", "-1.0000000000000002E-6", "NaN", "-0.5", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0000000000000002E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=-2147483592, getMin=-1.0000000000000002E-6, getRelativeAccuracy=Infinity, getStartValue=-...#204#-904433351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:5>", "Infinity", "-1.0", "-0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=10, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"33.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "21", "<sample:1>", "-0.5", "4.740000200000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=4.740000200000001, getMaxEvaluations=21, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=2.1200001000000...#204#-379803666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"147461", "<sample:7>", "Infinity"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=147461, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "4.0000000000000014E-7", "5.0E-7", "-1.7976931348623157E308", "<sample:4>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0000000000000014E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=5.0E-7, getMaxEvaluations=2147483647, getMin=4.0000000000000014E-7, getRelativeAccuracy=1.0E-14, getStartValue=-1....#221#872996700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1073741752", "<sample:0>", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1073741752, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E30...#202#2132854239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623155E308", "0.0", "56.5"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:9>", "2.0000000000000008E-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0000000000000008E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:0>", "-Infinity", "1.0000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=N...#203#-2055032567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-0.09000000000000001", "2.0000000000000012E-7", "0.09000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-0.1", "-0.052000000000000005", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483626", "<sample:3>", "-1.7976931348623157E308", "NaN", "NaN", "<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "147461", "<null>", "-4.9E-324", "-2.000000000000001E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483619", "<sample:6>", "31.5", "0.0300004", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"262148", "<sample:8>", "Infinity", "Infinity", "0.5", "<sample:10>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.39000000000000024"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=262148, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"2.0000000000000003E-6", "1.0000000000000002", "0.0410002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.0", "0.01", "-1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:9>", "NaN", "NaN", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483632", "<sample:5>", "0.25000000000000006", "1.7976931348623155E308", "-7.1000000000000005"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "10.0", "Infinity", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=10.0, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.09400000000000001", "-0.09000000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "-8.988465674311579E307", "-0.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"4.000000000000001E-7"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-0.026000000000000002"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:3>", "-8.988465674311578E307", "4.0000000000000014E-7", "<sample:6>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147467232", "<sample:5>", "1.0", "-0.09999999999999999", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.9999999999999995E-6"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1073741776", "<sample:0>", "-62.99999999999999", "-4.0000000000000014E-7", "-0.1", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0000000000000014E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.0000000000000014E-7, getMaxEvaluations=-1073741776, getMin=-62.99999999999999, getRelativeAccuracy=1.0, get...#216#1998186601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.025"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483590", "<sample:7>", "63.00000099999999", "0.052000000000000005", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "4", "<sample:9>", "2.0E-7", "2.0000000000000004E-7", "1.0000000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000004E-7, getMaxEvaluations=4, getMin=2.0E-7, getRelativeAccuracy=0.0, getStartValue=1.000000000000000...#202#-345181055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "1.0000000000000002E-7", "-4.100000400000001"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-65.99999999999999", "-0.09000000000000001", "5.9"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "8.000000000000001E-6", "-5.1000002", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-2147483648", "<sample:2>", "-0.249", "-4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483634", "<sample:9>", "-0.18000000000000002"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1073741707", "<sample:10>", "1.7976931348623155E308", "-0.69", "-0.052000000000000005"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-4.0000000000000014E-7", "1.0000000000000002", "2.0000000000000003E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1073741823", "<sample:7>", "0.047002", "0.0", "1.7976931348623157E308", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.780001", "-Infinity", "23.0000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=1073741823, getMin=0.047002, getRelativeAccuracy=1.0E-14, getStartValue=1.797693134862315...#206#1117539771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "NaN", "-2.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "Infinity", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"2.0E-6", "1.0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1073741767", "<sample:12>", "-0.026000000000000002", "-2.0000000000000007E-7", "<sample:1>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "39.0", "-45.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "589844", "<sample:9>", "-Infinity", "-Infinity", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("589844", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=589844, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:5>", "0.5000000000000001", "1.7976931348623157E308", "-2.000000000000001E-7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=0.5000000000000001, getRelativeAccuracy=1.0E-14, ge...#234#-1201845029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483646", "<sample:3>", "1.0000000000000002E-6", "1.0000000000000002", "-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"2.0620000000000003", "-0.9999999999999999", "50.0000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "2.0000000000000007E-7", "-4.000000000000003", "2.0E-6"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"62", "<sample:7>", "-1.8000000000000003", "4.0000000000000014E-7", "1.999999999999999E-6", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.8000000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=4.0000000000000014E-7, getMaxEvaluations=62, getMin=-1.8000000000000003, getRelativeAccuracy=1.0E-14, getStartVa...#225#1593112211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:10>", "-66.18", "-0.1", "0.052000000000000005"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:9>", "0.9900000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-66.18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.1, getMaxEvaluations=2147483647, getMin=-66.18, getRelativeAccuracy=1.0E-14, getStartValue=0.0520000000000000...#203#-913885108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483595", "<sample:8>", "1.0000000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483595, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<sample:2>", "2.0000000000000007E-7", "1.7976931348623158E307", "<sample:5>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.25", "1.0", "-0.5000000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2.0000000000000003E-6", "-6.460000000000001", "0.10000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"4.0E-6", "2.0000000000000004E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "Infinity", "4.000000000000001E-7", "-0.052000000000000005"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147352533", "<sample:4>", "-18.299998000000002", "1.0E-6", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-2147483595", "<sample:8>", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483617", "<sample:8>", "1.0E-6", "-8.0", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "48.0", "0.9999999999999999"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-1073741797", "<sample:7>", "2.0E-6", "-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "0.0", "NaN", "9.999999999999997E-7", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2", "<sample:8>", "-1.7976931348623157E308", "Infinity", "2.0000000000000003E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=Infinity, getMaxEvaluations=2, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0, getStartValue=2.0000...#216#-193479916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2013265919", "<sample:4>", "-2.0000000000000005E-5", "Infinity", "4.9E-324"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2013265919, getMin=-2.0000000000000005E-5, getRelativeAccuracy=1.0E-14, getStartValue=4...#208#816009862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.5", "0.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"4", "<sample:3>", "Infinity", "NaN", "2.0000000000000004E-7", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-2.0E-6"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:5>", "-2.0", "1.7976931348623157E308", "1.0E-6", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.5", "0.2400001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-9.999999999999997E-7", "-1.0", "1.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-7.9999998", "4.999999999999999E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "-1.1400000000000001", "5.0E-7"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483605", "<sample:9>", "4.000000000000001E-7", "1.7976931348623155E308", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483594", "<sample:4>", "NaN", "-2.0000000000000007E-7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "4.000000000000001E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"32767", "<sample:5>", "-1.7976931348623157E308", "0.0049999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "9.999999999999999E-6", "NaN", "-4.000000000000001E-7"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:10>", "-0.09000000000000001", "1.7976931348623157E308", "-33.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=-0.09000000000000001, getRelativeAccuracy=1.0E-14, ge...#218#1863343203", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "-4.0000000000000014E-7"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.047998", "Infinity", "8.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:9>", "1.7976931348623157E308", "4.0000000000000015E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=4.0000000000000015E-6, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14,...#237#1192414634", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-50.999998", "4.9E-324"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483595", "<sample:10>", "-27.999998999999995", "1.7976931348623157E308", "0.047002"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-0.0145001", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2147483595, getMin=-27.999998999999995, getRelativeAccuracy=1.0E-14, get...#220#698962716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:5>", "-0.029999800000000004", "9.999999999999997E-7", "4.0000000000000003E-7"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483595", "<sample:2>", "-0.052000000000000005", "1.0000000000000002", "-Infinity", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "294922", "<sample:7>", "-0.1", "-2.000000000000001E-7", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-2.000000000000001E-7, getMaxEvaluations=294922, getMin=-0.1, getRelativeAccuracy=1.0E-14, getStartValue=-0.0500...#215#1714802386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "2.0E-6", "1.9999999999999996E-7", "-62.999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:8>", "-330.00000000000006", "2.0000000000000007E-7", "-0.09999999999999999", "<null>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:3>", "-2.0000000000000007E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-2.0000000000000007E-7...#201#544285749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"6", "<sample:7>", "NaN", "4.0000000000000014E-7", "-0.26"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=4.0000000000000014E-7, getMaxEvaluations=6, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-0.26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:6>", "-33.00000000000001", "-1.17", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.17, getMaxEvaluations=-2147483648, getMin=-33.00000000000001, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-2.0000000000000007E-7", "2.000000000000001E-5"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:6>", "1.7976931348623155E308", "-1.0000000000000002", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000002, getMaxEvaluations=-2147483648, getMin=1.7976931348623155E308, getRelativeAccuracy=0.0, getStar...#211#-1193961092", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:6>", "2.0000000000000004E-7", "0.2999998", "1.0E-6", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.2999998, getMaxEvaluations=-2147483648, getMin=2.0000000000000004E-7, getRelativeAccuracy=1.0E-14, getStartVal...#210#1964455618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "2.0000000000000004E-7", "1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1073741825", "<sample:8>", "-0.043997999999999995", "-0.2699998"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1073741797", "<sample:6>", "-4.000000000000001E-8", "1.7976931348623155E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623155E308, getMaxEvaluations=1073741797, getMin=-4.000000000000001E-8, getRelativeAccuracy=1.0E-14,...#219#-1783456797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483605", "<sample:0>", "49.0", "5.300001000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=5.300001000000001, getMaxEvaluations=2147483605, getMin=49.0, getRelativeAccuracy=1.0, getStartValue=27.150000...#202#-616628907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:9>", "Infinity", "-2.000000000000001E-6", "-0.052"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1", "<sample:8>", "-1.0000000000000006E-7", "-8.988465674311579E307", "-4.000000000000001E-7"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "4.000000000000001E-7", "-4.4942328371557893E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=-8.988465674311579E307, getMaxEvaluations=1, getMin=-1.0000000000000006E-7, getRelativeAccuracy=Infinity, getSta...#230#962319111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1", "<sample:0>", "-0.018998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-0.018998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1006632933", "<sample:3>", "1.7976931348623157E308", "-1.0000000000000002", "-0.1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000002, getMaxEvaluations=-1006632933, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, ...#219#-377801398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483645", "<sample:10>", "0.3999996", "4.0E-6", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=4.0E-6, getMaxEvaluations=2147483645, getMin=0.3999996, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E307", "-1.7976931348623157E308", "1.0000000000000002E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.5", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1073741797", "<sample:7>", "-2.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1073741797, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-2.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:9>", "-Infinity", "4.0000000000000003E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0000000000000003E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=4.0000000000000003E-7, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=N...#203#-1600502073", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-4.999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "33", "<sample:6>", "-0.5", "-0.009999599999999999", "26.000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.009999599999999999, getMaxEvaluations=33, getMin=-0.5, getRelativeAccuracy=0.0, getStartValue=26.000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "-2.0000000000000004E-7", "-8.988465674311579E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1073741823", "<sample:5>", "8.988465674311578E307", "1.7976931348623157E308", "1.7976931348623155E308", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=1073741823, getMin=8.988465674311578E307, getRelativeAccuracy=1.0E-14,...#238#1826905363", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.9860000000000003", "-1.7976931348623157E308", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "-2.0E-6", "-2.000000000000001E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147481546", "<sample:7>", "0.2799996", "-1.0", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2799996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=2147481546, getMin=0.2799996, getRelativeAccuracy=1.0, getStartValue=-0.3600002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:6>", "0.5", "0.06799999999999999", "-Infinity", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.06799999999999999, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-Infi...#205#-452078304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:11>", "-1.0", "0.0", "-9.000000000000001E-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.000000000000001E-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-9.000000000000001E-...#202#-1223205195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"4.000000000000001E-7"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483594", "<sample:1>", "-4.0000002", "1.0", "9.999999999999999E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=1.0, getMaxEvaluations=2147483594, getMin=-4.0000002, getRelativeAccuracy=1.0, getStartValue=9.9999999999999...#206#-931041230", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "4", "<sample:10>", "-1.7976931348623157E308", "0.028002", "NaN", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.028002, getMaxEvaluations=4, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2.0000000000000008E-6", "0.5000000000000001", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:9>", "0.1", "-0.10000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.10000000000000002, getMaxEvaluations=2147483647, getMin=0.1, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "37.99999979999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0E-7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:6>", "Infinity", "-9.999999999999995E-7", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2038", "<sample:9>", "0.6399998000000001", "-66.0", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:0>", "2.0000000000000004", "2.0E-6", "12.0000002"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "18", "<sample:0>", "-1.7976931348623157E308", "Infinity", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=18, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Infinit...#202#-1391848081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1073741797", "<sample:5>", "3.9999998", "NaN", "-0.09000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741797", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1073741797, getMin=3.9999998, getRelativeAccuracy=1.0E-14, getStartValue=-0.090000000000000...#203#357295202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-Infinity", "-2.000000000000001E-5", "-2.0000000000000003E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:3>", "0.5", "NaN", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "2.0E-6", "2.0000000000000004E-7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-2.000000000000001E-7", "1.0000000000000002E-6"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-51", "<sample:0>", "-Infinity", "1.7976931348623157E308", "-2.0000000000000004", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-2.0000000000000004E-7"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1073741797", "<sample:8>", "-0.05200000000000001"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.978845608028496E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1073741797, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-0.05200000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"147483", "<null>", "1.0", "2.0E-6", "-1.0", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.0000000000000002", "2.0000000000000004"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:0>", "0.10000000000000002", "0.09000000000000001", "0.220002", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.09000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.09000000000000001, getMaxEvaluations=2147483647, getMin=0.10000000000000002, getRelativeAccuracy=1.0E-14, getSta...#217#-1189039960", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"294922", "<null>", "-2.0000000000000004E-8", "-0.1", "5.0E-7"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "9", "<sample:8>", "0.995", "-2.0E-7", "-0.1"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-294922", "<sample:0>", "-2.0000000000000008E-6", "0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.1, getMaxEvaluations=-294922, getMin=-2.0000000000000008E-6, getRelativeAccuracy=1.0, getStartValue=0.049999...#201#123068504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483645", "<sample:16>", "2.0000000000000007E-7", "-2.0000000000000007E-7", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0000000000000007E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-2.0000000000000007E-7, getMaxEvaluations=-2147483645, getMin=2.0000000000000007E-7, getRelativeAccuracy=1.0E-14, g...#232#-1499272039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"13.0", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:4>", "1.7976931348623157E308", "-11.0", "2.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-11.0, getMaxEvaluations=-2147483648, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=2.0...#204#1065919305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "6.2000002", "-0.052000000000000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:4>", "-2.0000000000000007E-7", "0.10000000000000002", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.10000000000000002, getMaxEvaluations=2147483647, getMin=-2.0000000000000007E-7, getRelativeAccuracy=Infinity, ...#218#1167292231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-21.999998", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"8.4000008"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:8>", "1.7976931348623157E308", "4.0000000000000003E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5968979127386578E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=4.0000000000000003E-7, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14,...#237#-792455827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:1>", "1.0", "0.0", "1.7976931348623155E308", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-0.07999998", "-1.0", "-0.013998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"44", "<sample:7>", "-0.52", "-4.000000000000001E-7", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1073741802", "<sample:11>", "Infinity", "1.7976931348623157E308", "-0.052000000000000005", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.000000000000001E-7, getMaxEvaluations=44, getMin=-0.52, getRelativeAccuracy=1.0E-14, getStartValue=-0.2600002...#201#-528606724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"294922", "<sample:10>", "-0.04999999999999999", "Infinity", "-1.0000000000000002"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=294922, getMin=-0.04999999999999999, getRelativeAccuracy=1.0E-14, getStartValue=-1.000...#214#-1647617391", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483588", "<sample:8>", "0.09000000000000001", "Infinity", "5.9"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:4>", "0.5", "-Infinity", "2.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483588, getMin=0.09000000000000001, getRelativeAccuracy=1.0E-14, getStartValue=5.9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-5.999998", "8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1073741797", "<sample:5>", "0.949"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "262143", "<sample:4>", "-9.996E-4", "-1.7976931348623157E308", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262143", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=262143, getMin=-9.996E-4, getRelativeAccuracy=1.0E-14, getStartValue=...#223#107815258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"24", "<null>", "Infinity", "1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-60.999998", "1.7976931348623153E308"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-2.000000000000001E-6", "2.0E-6", "0.010001"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "NaN", "5.0E-7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483647", "<null>", "-18.0", "-Infinity", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"4", "<sample:4>", "2.0000000000000004E-7", "-Infinity", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=4, getMin=2.0000000000000004E-7, getRelativeAccuracy=1.0E-14, getStartValue=-Infini...#203#-490248783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-33.00000000000001", "1.0", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0E-6", "1.0000000000000002E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"4", "<sample:10>", "38.25", "-2.0000000000000007E-7"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-3.3", "-0.052000000000000005", "-1.0E-7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:3>", "4.0000000000000014E-7", "4.000000000000001E-7", "-Infinity", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0000000000000014E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=4.000000000000001E-7, getMaxEvaluations=2147483647, getMin=4.0000000000000014E-7, getRelativeAccuracy=1.0E-14, g...#223#-139324039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:8>", "9.999999999999995E-7", "4.048000000000001", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=4.048000000000001, getMaxEvaluations=-1, getMin=9.999999999999995E-7, getRelativeAccuracy=0.0, getStartValue=2.0240...#213#1322382799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "8197", "<sample:3>", "1.041", "1.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8197", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000004, getMaxEvaluations=8197, getMin=1.041, getRelativeAccuracy=1.0E-14, getStartValue=1.020500000...#208#-546825512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:9>", "-36.99999999999999", "2.0000000000000003E-6", "-0.052000000000000005"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000003E-6, getMaxEvaluations=2147483647, getMin=-36.99999999999999, getRelativeAccuracy=1.0E-14, get...#233#-1444720830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-2.0000000000000007E-7", "0.24999999999999997"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:6>", "2.0E-6", "-0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483605", "<sample:3>", "-Infinity", "-2.0000000000000007E-7", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-2.0000000000000007E-7, getMaxEvaluations=-2147483605, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValu...#207#1047652150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"91", "<sample:6>", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "2.000000000000001E-6", "8.988465674311578E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"2.0000000000000004E-7"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1074036687", "<sample:4>", "0.9000000000000001", "-29.999998", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.978845608028496E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-29.999998, getMaxEvaluations=1074036687, getMin=0.9000000000000001, getRelativeAccuracy=1.0E-14, getStartValue=...#211#791778271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483583", "<sample:6>", "-0.129", "Infinity", "-Infinity", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483583", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483583, getMin=-0.129, getRelativeAccuracy=1.0E-14, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1071", "<sample:7>", "-1.7000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1071, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-1.7000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483595", "<sample:4>", "1.7976931348623155E308", "64.74", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=64.74, getMaxEvaluations=-2147483595, getMin=1.7976931348623155E308, getRelativeAccuracy=1.0, getStartValue=...#204#-2054654848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:3>", "Infinity", "-2.0E-6", "-32.942"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "8.988465674311579E307", "-0.18000000000000002", "-5.099999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-0.09000000000000001", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "5", "<sample:5>", "-0.1", "1.7976931348623157E308", "-2.000000000000001E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=-0.1, getRelativeAccuracy=1.0E-14, getStartValue=-2.00000000...#211#-997461246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"2.000001", "70.000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:4>", "-0.2"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2359298", "<sample:1>", "1.0000000000000002", "2.0000000000000003E-6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000003E-6, getMaxEvaluations=2359298, getMin=1.0000000000000002, getRelativeAccuracy=1.0E-14, getSta...#232#-439874991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-294914", "<sample:8>", "0.0", "4.0000000000000003E-7", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "2.0000000000000004E-7", "2.5000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=4.0000000000000003E-7, getMaxEvaluations=-294914, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:10>", "-33.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"2.0E-7", "1.0000000000000002E-6", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "2.0000000000000004E-7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"21", "<sample:8>", "0.200002", "-Infinity", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=21, getMin=0.200002, getRelativeAccuracy=1.0E-14, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-13.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "Infinity", "-0.5", "-2.000000000000001E-7"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.09000000000000004", "1.7976931348623157E308"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:0>", "-6.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-6.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483598", "<sample:7>", "1.7976931348623155E308", "2.0000000000000007E-7", "4.000000000000001E-7", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=2.0000000000000007E-7, getMaxEvaluations=2147483598, getMin=1.7976931348623155E308, getRelativeAccuracy=1.0,...#236#1114201675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483594", "<sample:6>", "-0.61", "8.988465674311578E307", "0.0", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=8.988465674311578E307, getMaxEvaluations=2147483594, getMin=-0.61, getRelativeAccuracy=1.0E-14, getStartValue=0....#202#-1675227438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0000000000000001E-7", "2.0000000000000004E-7", "14.0000002"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "294907", "<sample:1>", "-1.0", "-0.9999999999999999", "-0.1", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.9999999999999999, getMaxEvaluations=294907, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"2.0E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "61", "<sample:4>", "Infinity", "2.0000000000000004E-7", "-0.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000004E-7, getMaxEvaluations=61, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "Infinity", "NaN", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1073741823", "<sample:7>", "-59.05", "8.988465674311579E307", "9.999999999999997E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "4.000000000000001E-6", "2.0E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-59.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=8.988465674311579E307, getMaxEvaluations=1073741823, getMin=-59.05, getRelativeAccuracy=1.0E-14, getStartValue=9...#220#31085721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"51", "<sample:10>", "Infinity", "-28.5", "-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.7976931348623157E308", "-3.3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=-28.5, getMaxEvaluations=51, getMin=Infinity, getRelativeAccuracy=1.0, getStartValue=-1.7976931348623157E308...#201#-1399692669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1073741797", "<sample:4>", "-0.10400000000000001", "-4.8000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10400000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.8000002, getMaxEvaluations=-1073741797, getMin=-0.10400000000000001, getRelativeAccuracy=1.0E-14, getStartVal...#223#-833450677", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147481543", "<sample:0>", "4.300000199999999", "2.0000000000000003E-6", "-2.0000000000000007E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.300000199999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000003E-6, getMaxEvaluations=-2147481543, getMin=4.300000199999999, getRelativeAccuracy=1.0E-14, get...#234#-901125399", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "147717", "<sample:9>", "-50.99999960000001", "0.31", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483518", "<sample:5>", "2.0000000000000003E-6", "4.000000000000001E-6", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=4.000000000000001E-6, getMaxEvaluations=2147483518, getMin=2.0000000000000003E-6, getRelativeAccuracy=0.0, getStart...#229#-930287469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147418111", "<sample:3>", "-Infinity", "-0.016998000000000003", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.016998000000000003, getMaxEvaluations=2147418111, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValu...#206#-1468481841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:8>", "NaN", "-60.5", "9.999999999999999E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-60.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-60.5, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=9.999999999999999E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "4.9E-324", "0.0", "-0.1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=4.9E-324, getRelativeAccuracy=1.0E-14, getStartValue=-0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "8.000000000000002E-7", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:0>", "NaN", "1.0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1073741802", "<sample:3>", "0.0470002"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741802", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1073741802, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.0470002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-0.05200000000000001", "0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "1.0", "4.199999979999999", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=4.199999979999999, getMaxEvaluations=2147483647, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "-1.0", "Infinity", "4.9E-324", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-2.0000000000000004", "-0.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "Infinity", "1.9999999999999995E-6", "-5.999999"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "1.7976931348623153E308", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"294830", "<sample:10>", "1.7976931348623155E308", "5.0", "-2.0000000000000007E-7", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=294830, getMin=1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartValue=-2.0000...#216#64009296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"7", "<sample:5>", "Infinity", "-0.09", "0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-20", "<sample:7>", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-20, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:8>", "0.25", "0.5", "<sample:9>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "Infinity", "0.5000000000000001", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5000000000000001, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=Na...#202#223240257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.3000004", "1.0E-6"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483594", "<sample:1>", "-Infinity", "4.0000000000000003E-7", "50.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "4", "<sample:12>", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:2>", "8.988465674311578E307", "1.9999999999999995E-6", "-Infinity", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=1.9999999999999995E-6, getMaxEvaluations=1, getMin=8.988465674311578E307, getRelativeAccuracy=Infinity, getStart...#216#-400686935", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"17", "<sample:4>", "-0.036000000000000004", "NaN", "Infinity"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"589844", "<sample:10>", "-1.0", "-1.7976931348623157E308", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=589844, getMin=-1.0, getRelativeAccuracy=1.0, getStartValue=-8.9884...#216#1745208086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "Infinity", "-0.064"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "8.988465674311579E307", "-4.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "-57.999999", "-4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "8388610", "<sample:3>", "Infinity", "1.0E-6", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=8388610, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"2.0E-6", "1.0", "1.0000000000000002"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "9.999999999999995E-7", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-1.7976931348623157E308", "-66.0", "<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-66.0, getMaxEvaluations=2147483647, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=...#223#-157577189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.0E-6", "1.0", "-1.0600000000000003"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-66813942", "<sample:4>", "4.999999999999998E-7", "5.9", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=5.9, getMaxEvaluations=-66813942, getMin=4.999999999999998E-7, getRelativeAccuracy=1.0E-14, getStartValue=1.7976...#217#-262472254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"47", "<sample:4>", "26.948", "1.7976931348623157E308", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=47, getMin=26.948, getRelativeAccuracy=1.0E-14, getStartValue=-8.98846...#215#1205312909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"4", "<sample:8>", "-0.315", "9.999999999999997E-7", "1.9999999999999995E-6"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.086363805798071E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999997E-7, getMaxEvaluations=4, getMin=-0.315, getRelativeAccuracy=0.0, getStartValue=1.9999999999999995...#204#-440771143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "1026", "<sample:7>", "-8.988465674311579E307", "1.9999999999999995E-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.9999999999999995E-6, getMaxEvaluations=1026, getMin=-8.988465674311579E307, getRelativeAccuracy=1.0E-14, getSt...#233#-798944619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483594", "<sample:6>", "0.5000000000000001", "8.988465674311578E307", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=8.988465674311578E307, getMaxEvaluations=2147483594, getMin=0.5000000000000001, getRelativeAccuracy=0.0, getStartVa...#226#-425570262", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.9999999999999998", "2.0", "27.9999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-2.0000000000000007E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"294922", "<sample:7>", "-0.050980000000000004", "0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.050980000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.49999999999999994, getMaxEvaluations=294922, getMin=-0.050980000000000004, getRelativeAccuracy=1.0E-14, getSta...#228#-1925651608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<sample:3>", "1.0000000000000002E-6", "Infinity", "-0.2", "<sample:6>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2050", "<sample:2>", "9.999999999999995E-7", "-0.052", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999999999995E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=-0.052, getMaxEvaluations=2050, getMin=9.999999999999995E-7, getRelativeAccuracy=1.0E-14, getStartValue=-0.02599...#203#-1162221554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "1.0", "-1.9999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "2.000000000000001E-7", "1.0E-7"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"33", "<sample:2>", "-0.5000000000000002", "Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=33, getMin=-0.5000000000000002, getRelativeAccuracy=1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "4194305", "<sample:9>", "-0.09000000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194305", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=4194305, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-0.09000000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:6>", "-0.0264", "0.0", "37.000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0264", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-1, getMin=-0.0264, getRelativeAccuracy=1.0E-14, getStartValue=37.000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.315", "1.9999999999999995E-6", "-0.15750000000000003"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:11>", "1.3000000000000003", "2.0000000000000004E-7", "-1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000004E-7, getMaxEvaluations=2147483647, getMin=1.3000000000000003, getRelativeAccuracy=1.0E-14, get...#219#-714639856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"9.999999999999995E-7", "-2.0000000000000007E-7", "0.48"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:4>", "Infinity", "4.4942328371557893E307", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=4.4942328371557893E307, getMaxEvaluations=-2147483648, getMin=Infinity, getRelativeAccuracy=1.0, getStartValue...#205#-825728415", SearchInputFactory_scaffolding.receiverState());
 }
}
