package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-7.0"}, false, 14, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "0.49999999999999994"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-58.0"}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-42.23800000000001", "0.22725"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "0.982"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "0.0", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22725", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 8, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "-1.7976931348623157E308", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "-1.7976931348623157E308", "-1.7976931348623155E308"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "20120110"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-20120110"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-10060055"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-562949963481367"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "20120110"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"8.988465674311579E307", "-52.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "3.5953862697246315E307"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"3.595386269724632E307"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"41.3"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-8.26"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "12.0"}, {"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"20120109"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "12.0"}, {"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "-51.95200000000001"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "-63.0"}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "4.13"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "51.95200000000001"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "-63.0"}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "4.13"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.800000000000001", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-3.5", "3.5953862697246315E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-63.79999999999999", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-63.79999999999999", "-1.7000000000000002"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-127.63799999999998", "-1.7000000000000002"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"127.63799999999998", "-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "8.260000000000002"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "2.0650000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "8.260000000000002"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "2.0650000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "20120109"}, {"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", "long", "-576460752303423361"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.0", "1.7976931348623157E308"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.13", "3.5953862697246315E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.13", "3.5953862697246315E307"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.13", "3.5953862697246315E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "12.0"}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "0.49999999999999994"}, {"org.apache.commons.math3.distribution.FDistribution", "density", "double", "3.5953862697246315E307"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "-3.5"}, {"org.apache.commons.math3.distribution.FDistribution", "density", "double", "3.5953862697246315E307"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-1.7976931348623157E308", "-3.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double,double", "-1.7976931348623157E308", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"3.5953862697246315E307", "0.49999999999999994"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "0.49999999999999994"}, {"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "0.49999999999999994"}, {"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"20120109"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"20120110"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"8.988465674311579E307", "4.4942328371557893E307"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"11"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getDenominatorDegreesOfFreedom", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"-20120172"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"3.5953862697246315E307"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"3.5953862697246315E307"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "12.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"20120109", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "-5.2"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-3.5", "3.5953862697246315E307"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-8516354193418641626"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "-8516354193418641566"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "1.0E-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "1.0E-9"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"4.13"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"148.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-1.7976931348623157E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"9.999999999999998"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"71"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -...#781#-2120040829", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.413"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.413", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.826"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.826", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.41299999999999987"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.41299999999999987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.8259999999999997"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8259999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"12.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"10"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"20"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"1.0E-9", "1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"2.0000000000000005E-9", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "3.5953862697246315E307"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.7000000020000001", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2999999979999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-0.7000000020000001", "1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.700000002", "4.4942328371557893E307"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.299999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.745000002", "4.4942328371557893E307"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25499999799999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-8795681980394"}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "-2147483648"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4363481251863"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "4.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-1.4000000000000004"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "-8516354193418641566"}, {"org.apache.commons.math3.distribution.FDistribution", "density", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"29.1"}, false, 13, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-7.0", "12.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"-0.0"}, false, 13, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "20120109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"-0.0"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "20120109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "NaN", "-7.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"2.0340000000000007"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"8.260000000000002"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "NaN", "3.5953862697246315E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "1.0E-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"4.0", "1.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "Infinity", "NaN"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08333333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-5.8"}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double", "Infinity"}, {"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"13"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"3.5953862697246315E307", "0.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "density", new String[]{"double"}, new String[]{"NaN"}, false, 12, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", "double", "2.5E-9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-9"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "density", new String[]{"double"}, new String[]{"-1.0"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-1.0", "12.0"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-8.5163541934186414E18", "0.5"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7032708386837285E19", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "4.13"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7032708386837285E19", "0.05"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "0.9999999999999999"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.0945"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0945", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.3150000000000002", "0.113625"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "-4.13"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.113625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7032708386837283E19", "0.4545000000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "14.9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4545000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-3.4065416773674568E18", "0.4545000000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "Infinity", "NaN"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4545000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-3.4065416773674573E18", "0.22725000000000006"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22725000000000006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportLowerBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "20120109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-3.406541677367457E19", "NaN"}, false, 8, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "4.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "NaN"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"1.7032708386837283E19", "NaN"}, false, 8, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "8.516354193418641E19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-4.4942328371557893E307", "NaN"}, false, 14, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "NaN"}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportUpperBoundInclusive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"-8516354193418641566"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", "long", "12"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportUpperBoundInclusive", ""}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.FDistribution", "probability", "double", "-8.5163541934186414E18"}, {"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-3.5"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", "double,double", "-7.0", "3.5953862697246315E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"Infinity", "3.542"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-7.070000000000001"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-Infinity", "-4.494232837155789E307"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "sample", "int", "2147483647"}, {"org.apache.commons.math3.distribution.FDistribution", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "12.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-8516354193418641566", "0.49999999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.005"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "6.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double,double", "-1.7032708386837283E19", "0.49999999999999994"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "1.0", "20120109"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "-3.5", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "-3.5", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "4.129999999999999", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "4.129999999999999", "-8516354193418641566"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "4.129999999999999", "4.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "sample", "int", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "probability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-3.5953862697246315E307"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportLowerBoundInclusive", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "1.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double", "1.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "-10.0"}, {"org.apache.commons.math3.distribution.UniformRealDistribution", "probability", "double", "1.0E-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "density", "double", "-8516354193418641566"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=-0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=-1.0, getSupportUpperBound=0.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#-1550759674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.FDistribution", "getSolverAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "probability", new String[]{"double", "double"}, new String[]{"-7.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "isSupportConnected", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"Infinity", "3.5953862697246315E307"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "cumulativeProbability", "double,double", "20120109", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumericalMean=Infinity, getNumericalVariance=Infinity, getSupportLowerBound=1.0, getSupportUpperBound=Infinity, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundInclu...#210#1221303308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "sample", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "inverseCumulativeProbability", "double", "12.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=0.0, getNumeratorDegreesOfFreedom=0.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=true,...#272#-1786636428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "getNumeratorDegreesOfFreedom", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"26"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "cumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDenominatorDegreesOfFreedom=Infinity, getNumeratorDegreesOfFreedom=1.0, getNumericalMean=NaN, getNumericalVariance=NaN, getSupportLowerBound=0.0, getSupportUpperBound=Infinity, isSupportConnected=...#277#-1039560503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.FDistribution", "org.apache.commons.math3.distribution.FDistribution", "sample", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.FDistribution", "density", "double", "20120109"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=0.5, getNumericalVariance=0.08333333333333333, getSupportLowerBound=0.0, getSupportUpperBound=1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIncl...#211#-725623620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.UniformRealDistribution", "org.apache.commons.math3.distribution.UniformRealDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"55"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.UniformRealDistribution", "getSolverAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumericalMean=-Infinity, getNumericalVariance=Infinity, getSupportLowerBound=-Infinity, getSupportUpperBound=-1.0, isSupportConnected=true, isSupportLowerBoundInclusive=true, isSupportUpperBoundIn...#213#308022207", SearchInputFactory_scaffolding.receiverState());
 }
}
