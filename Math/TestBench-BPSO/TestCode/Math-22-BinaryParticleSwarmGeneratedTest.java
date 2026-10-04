package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-19.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.5163541934186414E18", "24.0"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "NaN"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.0", "-20.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-8516354193351532701"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "3.938"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"Infinity", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "8.5163541934186414E18", "-Infinity"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "-Infinity", "8.5163541934186424E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "18.0", "4.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"35184372088836"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"2.5", "-8516354193418641566"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-58"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"6.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "12"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"-2130706432"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "-0.9999999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "2.4", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0120108956999995E7"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "24.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.23"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-507.6", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"-254"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-8516354193418641516"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "1.7976931348623153E308", "1.7976931348623153E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "1.7976931348623153E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8516354193418641566", "-8516354193418641566"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"0.9999999999999998"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-1.7032708386837285E19"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "-9.63"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"24.0", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"12.0", "0.0"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"8.5163541934186414E18", "-1.0000000000000003E-9"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"8.5163541934186414E18"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.9999999999999999"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "9.600000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "-20120108"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0120109000000004E7"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "0.1", "-Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.4000000000000001"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "-8.5163541934186414E18", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"1.0060054489E7"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"1048588"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "-4.000000000000001"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"4.2581770967093207E18", "0.04"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"11.76"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"0.4"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.42300000000000004", "4.0"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-0.02", "8.5163541934186414E18"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "1.7976931348623155E308"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"0.30000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "5"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"2.8600000000000003"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "72057594058048046"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "48.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.9999999999999999", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"-45"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "2.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-1.09"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-0.61"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "8.5163541934186414E18"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double"}, new String[]{"-8.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"72057594058048046"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "1.0E-9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"-0.5499999990000001"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "1.0", "16.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "Infinity"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "20120108"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.0", "1.0000000000000002"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"-20120108"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "0.4", "1.7976931348623155E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "0.0", "-Infinity"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "3.9999999999999996", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "0.038000001"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "-4.000000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"-51.0"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"6"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "2.0", "-8.5163541934186414E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.141", "1.0E-9"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"54"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "40240218"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.38175943732660955", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-4.9E-324", "-50.99999999999999"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "2.0120109E8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "24.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "13"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"1.0", "8.988465674311578E307"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"16386"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-10.0", "4.0240218E7"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.0", "0.5"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "2251799833805356"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"5.0E-9", "0.2"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.199999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.25"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.7032708386837283E19", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.5", "-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-1.7976931348623155E308"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-0.58"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-32.999999999"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "0.5"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"5.0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"1.0"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "24.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-51.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"17592186044484"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-9218868437227405312"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-1020.0", "3.38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "8.5163541934186424E18"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"24.000000000000007", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "1.0", "0.513"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "0.2315"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-1.7976931348623155E308", "20.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-510.0", "-33.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"15"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.0", "Infinity"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.9E-324", "0.5"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"4096"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"12"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"8.5163541934186414E18"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "2.0120109E7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "536870964"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"-1.7032708386837283E19"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "8.988465674311578E307"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "-1.7976931348623155E308", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "-2.0", "4.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"3.8"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999998"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"Infinity", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "8.5163541934186424E18", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"2.55"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "24.0", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"65"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math3.distribution.FDistribution", "density", "double", "240.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"NaN", "Infinity"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "-1"}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"5.000000000000001E-10"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-8516354193418641566", "-4.2581770967093207E18"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"5.0E-10"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"72057594058048046"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0060054523E7"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "-Infinity"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "1.7976931348623155E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.170000001"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.170000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-8.5163541934186414E18", "0.88"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.88", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.4000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"40240096"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-0.6199999990000001", "-0.25"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.9999999999999999", "8.5163541934186424E18"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "2"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "-69.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"19.4"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"6"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.4", "6.000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "0.515"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-0.5", "0.4"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"NaN", "-1.0219999999999998"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "3.9999999999999996"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "1.7976931348623155E308"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "-12.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.4000000000000001"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "0.09999999999999999", "-8516354193418641566"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "1.0000000000000002"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "-102.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"6"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"11"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "-0.9999999999999999", "4.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "2097151"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.339"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.339", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-1.0", "-98.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"20120051"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "120.0"}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-1048576"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"8.5163541934186414E18", "Infinity"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.2"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "4"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "-10.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "4.2581770967093207E18"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-510.0", "0.5000000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "-Infinity"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "-10060054"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"6.051", "12.0"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "20120108"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"-0.515"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "0.4000000000000001", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"102.0", "1.00600545E7"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"1.954"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-20120110"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0000000000000003E-9"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000003E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-8.5163541934186424E18"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1073741830"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "12.000000000000002"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "0.4", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "1.0", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5899999999999997"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5899999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "57.4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.2", "1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "1.0E-10"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "0.9999999999999998"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"6.0"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-4.258177096709321E19"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"32770"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-51.63"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
}
