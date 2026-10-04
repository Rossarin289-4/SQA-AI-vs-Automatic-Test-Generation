package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "1", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "1", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.0", "-1", "-1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "10"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "32"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"1", "-32"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "12"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.0", "-1", "1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.7976931348623157E308", "-1", "1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "-1", "2"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "2147483647", "-4"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "1", "-4"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-1.0", "0", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "45"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "1", "16"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-1.0", "0", "-2147483648"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "45"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-436928820673516178"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "10", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"20"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"1073741823"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"1073741823"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483559"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483559"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-436928820673516179"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-4096"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.7976931348623157E308", "0", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "2147483647", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-134217727"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"2147483628"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.0", "10", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.0", "-262075", "-1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262074", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"1", "-536870912"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516213"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516146"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516179"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673514131"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-134217727"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-234872831"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8999999999999999", "-134217776", "0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516180"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8999999999999999", "-134217776", "10"}, false, 13, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516180"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8999999999999999", "-67108940", "-134217727"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134217727", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8479999999999999", "33554470", "-134215679"}, false, 14, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "1.7976931348623157E308", "2147483647", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134215679", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8479999999999999", "33554470", "2147483647"}, false, 14, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "1.7976931348623157E308", "2147483647", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33554471", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8479999999999999", "1140850764", "2147483647"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1140850765", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.8479999999999999", "570425382", "2147483647"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("570425383", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-134217742"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-Infinity", "1", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "1.7976931348623157E308", "-1", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-0.486", "-7", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "1.7976931348623157E308", "-1", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-436928820673516179"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-436928820673516179"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"19"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"10", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-30"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-36"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "1.7976931348623157E308", "-134217727", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464314E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464314E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "-1056964565"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "5"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483647", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "5"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-436928820673516179", "-1073741824", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-2"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516179"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "10"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-134217727"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "0"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-1.1102230246251565E-16"}, false, 15, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "9223372036854775807"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "-536870911"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"15", "20"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"15", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "8388744"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"76561193698851735"}, false, 10, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "0", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "0", "-1073741824"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "0", "2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "4096", "-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "4105", "-1073741823"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-2147483648"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-22.75", "134", "67240001"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("135", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3010426088001378E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-2147483597"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-134217721"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "0", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-2147483648"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "0", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "1"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "0", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "1"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "0", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "35", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "1.7976931348623157E308", "0", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516179"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "0"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"28"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"-7"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2", "40"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-436928820673516179", "2147483647", "-1073741824"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-2147483648", "-1073741824"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-1073741824", "-1"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-1073741824", "-134217727"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-2147483647"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"67108840"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-1.7976931348623157E308", "1", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-134217727", "1"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-1073739776"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "0", "-1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-1"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "NaN", "1", "-1073741824"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-2147483648"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464355E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1073741819", "134217726"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.0", "-1073741824", "2147483606"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.0", "-2147483648", "2147483606"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-134217727"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-436928820673516179", "10", "1073741824"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "-8", "-2147483635"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-1.0", "-1", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483635", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"-402649037"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"54"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "8.7385764134703232E17"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "0.0", "-1", "2147483647"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.0", "10", "0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "1", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.7976931348623157E308", "-2147352576", "-4085"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "NaN", "-2", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147352575", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-Infinity", "-2147483647", "-4085"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1", "0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "-1", "2147483635"}, false, 12, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483635", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-268566518"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-436928820673516180"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"301"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"57"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "0"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-1", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
}
