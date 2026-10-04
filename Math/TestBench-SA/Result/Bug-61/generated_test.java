package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "1.0E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"9999999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-2147483648"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"10000000"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "10"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "0.5"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "9999999"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "9999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"3.1415926535897927"}, false, 5, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "-1.0E-12"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "9995903"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "-10000042"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483602", "-10000042"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-134217812"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "probability", "double", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"-5"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int,int", "2147483646", "10000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "NaN", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", new String[]{"double"}, new String[]{"10000000"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "2"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "-1.0E-11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"9999999"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "1.0E-12"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainUpperBound", "double", "6.283185307179586"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", "long", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-23"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"1059"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "1.0E-12", "10000000"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "5.0E-13", "10000000"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", "int", "9999999"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "normalApproximateProbability", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "-20000090"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getDomainLowerBound", "double", "0.0"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "inverseCumulativeProbability", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "reseedRandomGenerator", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 9, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "getMean", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-1063741885", "2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "-9999999"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147348478"}, false, 14, new String[][]{{"org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", "int", "1"}, {"org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", "double,double", "1.0", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.distribution.PoissonDistributionImpl", "org.apache.commons.math.distribution.PoissonDistributionImpl", "cumulativeProbability", new String[]{"int", "int"}, new String[]{"-2147483647", "-2147483647"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getMean=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
