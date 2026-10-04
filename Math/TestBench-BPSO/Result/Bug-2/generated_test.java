package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"1048577"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"9223372036854775807"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "1048577"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "59.0", "0", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"49"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"34"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"0", "39"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464355E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"1", "2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"4.3692882067351616E17", "2147483590", "58"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "Infinity", "0", "2147483596"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("58", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"Infinity", "1", "-2147483648"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"24"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-4.9E-324", "28", "-2097154"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"24"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "-1048577"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-100.0", "-49", "0"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.5", "-12", "1048577"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"11", "2147483647"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"0.0", "-2147483648", "0"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "NaN", "32769", "-24"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"39"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-0.05", "-1", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-436928820136645266"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-39"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"1", "24"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"2.0", "-2147483648", "2097201"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097201", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.7976931348623157E308", "1073741902", "80"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("80", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"128"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"-39"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"4.0"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"1073741823", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"49", "-135266305"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"49"}, false, 7, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-39"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"76", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "2147483647", "-62"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-62", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-39"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-2.1846441033675808E17", "-524288", "-1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "-873857645641999656"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-524287", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "2147483585"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2147483647", "-1879048192"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-39", "24"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-103", "19"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "12", "39"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"8388624"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"2.0", "24", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1073741824", "0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"24"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "10", "-33554408"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"4.3692882067351616E17", "2147483647", "1048577"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1048577", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-38", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"18"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-436928820673516178"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"49", "536870912"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2147483647", "268435470"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-524289"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-4.3692882067351613E18", "-39", "-39"}, false, 4, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "NaN", "-39", "2147483613"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-39", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-436928820673516179"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"49"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "-1", "49"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "1073741823"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "24", "58"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-4.369288206735161E17", "0", "2097212"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "31"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"-1048539"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "12", "-1048577"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "Infinity", "-39", "524281"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "1", "1073741823"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "39", "131082"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"-8.7385764134703232E17"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "-78", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "1", "0"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-33"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.0", "-19", "1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "1050625", "-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"24"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677199433077E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"1", "1048577"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.7976931348623157E308", "78", "0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-0.9", "-524288", "-2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-524287", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-0.0", "-2147483648", "49"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.7976931348623157E308", "0", "-39"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "0"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-39", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "7", "-78"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.7976931348623157E308", "0", "16"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-5.0", "2", "-1"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "4"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-49", "0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-62", "24"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-1.0", "49", "12"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-Infinity", "2147483647", "-78"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "49", "98"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967725147478E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-262100"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "12"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "-2147483648", "-524288"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-524288", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "2147483647", "-2147483648"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1", "1073741824"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"-4.369288206735161E17", "-15728639", "24"}, false, 1, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15728638", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"1.0", "10", "1048577"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "30", "45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"49"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-1048577"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464314E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"49"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", new String[]{"double", "int", "int"}, new String[]{"NaN", "2147483647", "39"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("39", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "48"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-2097101"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalVariance", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "-4057"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int,int", "14", "66"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "436928820673516176"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "isSupportConnected", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "-1048548"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3010426088001378E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "getSupportLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getPopulationSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464355E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.793967722545389E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int"}, new String[]{"-78"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "solveInverseCumulativeProbability", "double,int,int", "-1.7976931348623157E308", "4106", "-24"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7939677238464314E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"49"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "upperCumulativeProbability", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", "double", "-436928820673516179"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"60"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "calculateNumericalVariance", ""}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", "int", "81"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "getSampleSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=0, getNumericalMean=NaN, getNumericalVariance=NaN, getPopulationSize=0, getSampleSize=0, getSupportLowerBound=0, getSupportUpperBound=0, isSupportConnected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", new String[]{"int"}, new String[]{"22"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1048577", "0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999972060323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-1"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumericalMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "probability", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "getNumberOfSuccesses", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3010426088001378E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.HypergeometricDistribution", "org.apache.commons.math3.distribution.HypergeometricDistribution", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.HypergeometricDistribution", "reseedRandomGenerator", "long", "9223372036854775807"}, {"org.apache.commons.math3.distribution.HypergeometricDistribution", "sample", "int", "58"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumberOfSuccesses=2, getNumericalMean=2.793967725147478E-9, getNumericalVariance=2.7939677199433077E-9, getPopulationSize=2147483647, getSampleSize=3, getSupportLowerBound=0, getSupportUpperBound=...#227#1950699293", SearchInputFactory_scaffolding.receiverState());
 }
}
