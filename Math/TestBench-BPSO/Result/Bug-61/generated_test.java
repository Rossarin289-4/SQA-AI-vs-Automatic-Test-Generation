package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0000000000000002"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"-10000000"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "0"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "10000000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483595"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-1073741825"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"10000000"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "0.219999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-19"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"4999999.999999999"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"720575940389279361"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-8.988465674311579E306"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-10000000"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"5.200000000001"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "1.0737418235E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9994890563317064", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"10000036"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0E-12", "2.147483647031E9"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-3.3499351211725962E18"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"9999948"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"9999999"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "1.3200000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-3349935121172596109"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0000000000000002", "1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "-1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7357588823428858", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "9999994"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "-1.0E-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "6.283185307179586"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-3349935121172596109"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "2147483647", "0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "8.988465674311579E307"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-6.283185307179586", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.0E-12"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-0.9999999999999999"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"6.283185307179588"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"15.957000000001", "4.294967294E9"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"20"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483546"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-4503597479886849"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "2147483610"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2047", "19999998"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"-1.0E7"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "0.0", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-12", "67108864"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "-10000000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.6900000000000002"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"-33.999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-2.147483647E9"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-9999999", "59"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.479"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-2147483647", "2147483618"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-2147483629"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "9999990"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"1.0000001199999997E7"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "-5.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-1.0000000000000002", "5000000.000000001"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "-9223367638808264704"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"20000014"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117144233", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "-65536"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-0.9600000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-4.699999999999999", "-0.10000000000000002"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "2.1474836470000002E8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-43", "9737857"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-17"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "8181"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "2147418111"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"10000000"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-41"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"0", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-2147483648", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "6.283185307179585"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"-2147483575"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "4.294967294E9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"19999998", "2147483611"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "4999983"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "9999969", "9999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 6, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-0.5000000000000002"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"6.283185307179585"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"2.0E7"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "2.147483647E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"2147483595"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-6.2"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"1073741797"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-1.7976931348623157E308", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-42"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "2.1474836469999998E9"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5000000000000001", "Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "NaN"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483595"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285393", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1674967560586298054"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "536870922"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "4"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"56"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "-10000000"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "30.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117146065", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-1.01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-5000000", "10000000"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "1"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "21.000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117144233", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-3349935121172596109"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-0.05", "1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483647"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "-2.147483647E9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.0", "1.6"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "-0.5"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "-3349935121172596120"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117146065", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"10000000"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"9999999"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "6.283185307179586"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1", "0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"9999999"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-0.609999999999"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"10000001"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "9999999.523"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117144233", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-1.7976931348623157E308", "-1.0000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2130706430"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "20000000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0000000000000002", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-9999999", "-9999999"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"-0.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-5.300000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "6.303185307179586"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117146065", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623158E307", "2.683185307179586"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "9999965"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.08030139707139305", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "1.5707963267948966"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1839397205857214", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "-28"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-6699870242345192253"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "9999963", "2147483595"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "0.38"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.0", "0.0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117146065", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-1.0", "-2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5", "10.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "0.0", "-3349935121172596109"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787943195528694", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-3.3499351211725967E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0", "12.566370614359172"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205587649416", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-23.999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0137771196302933E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-0.89"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "-22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4611686019501129727"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "2147483647", "10008192"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-67108790", "9999999"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"10000000"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.610000000001"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06680720126885803", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "0.49999999999999994"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"6.283185307179586"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "1"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"21"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483605"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-0.993"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"1000000.0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "9999999"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "19"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483608"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "19999998"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-43"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0000000000000004E-12"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"10", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"1.0E-12"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "1.0050000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-46"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-0.5000000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"NaN", "0.5"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"10.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0137771196302933E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "-3.3499351211725957E18"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-2147483648", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"1610612734"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "-1.67496756058629824E17", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-1.0000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "-4.9E-324"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8160602794142788", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-2097152"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "10000060", "2147483595"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"-6.6998702423451924E18"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"16"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7582714501302516E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "10000000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"2.0E-12"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"3.721592653589793"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"6.283185307179586"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "10000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999916758850712", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "2.1474836527E9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117146065", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483595"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "10000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7357588823428858", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0", "1.0520000000000003"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "-2147483590"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1839397205857214", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"71"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.325557940158435E-103", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.4600000000000002"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "9999945", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7357588823428858", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-8193"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-3.3499351211725962E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "0.5000000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06680720126885803", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "1073741823", "22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.919698602928607", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1", "2147483588"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-1.052"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"45"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "39"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.075343682050025E-57", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-3349935121172596109"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"9.999999999999999E-14"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"2", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "19999998"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "5000000.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "1.0737418235E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6321205588285393", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-37.716814692820414"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.308537538725987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.04999999999999999", "6.283185307179586"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6320373176792513", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"0.5"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.18393972058572114", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"5.0E-13"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483646"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "4999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2", "1"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "1.7976931348623157E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7357588823428858", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1", "2147483595"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "32.88318530717959"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"1073741855"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-3.3499351211725962E18"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.18393972058572114", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"-6.003185307179586"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "1.0000037E7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"12.566370614359172"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999364022", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8160602794142788", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-Infinity", "-8.988465674311579E307"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"-1.67496756058629811E18", "1.9999999999999996E7"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"10", "2147483647"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0137771200291468E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"8202"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "-50"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"0.5000000000000001", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1839397205857214", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", new String[]{"double"}, new String[]{"0.1"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"12.000000000000002"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999999940922", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1", "2147483647"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"2"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9331927987311419", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"12.566370614359172"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "4999972"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"2.0", "9999999.999999998"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "-9999991"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2642411176571142", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "4.9E-324", "Infinity"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117146065", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-2.0"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "-0.7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"70"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.071146137512432E-101", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483646"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"-2"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.006209665325776159", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"53"}, false, 2, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "-0.6450000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.605601994869997E-71", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6321205588285574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"double", "double"}, new String[]{"1.0000000000000002", "1.0000000000000002E7"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "5008191", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.18393972058572117", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "-10000001", "-20000000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"10", "10000056"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1142547828857374E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2"}, false, 7, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "-5000000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9386867598047597", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
