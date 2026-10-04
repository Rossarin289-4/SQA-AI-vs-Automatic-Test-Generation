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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "1.0E-50"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483646", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"10.0"}, false, 2, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483646", "NaN"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "1", "1.0E-50"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"NaN", "2147483647", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"NaN", "2147483647", "10"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0", "NaN", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-0.0", "1.0", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.012", "NaN", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-32807", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "Infinity", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.012", "NaN", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "Infinity", "10"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483646", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-1.0", "1.0E-50"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-8", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4426950408889632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-3.6", "47.0"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-2147483648", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "10", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-3.6", "47.0"}, false, 2, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-2147483648", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "10", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "1", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"Infinity", "23.5"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "10", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "1", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"2147483647", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.147483647E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1", "2.147483593E9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.147483593E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1", "4.294967186E9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.294967186E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1", "4.294967186E10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.294967186E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"1", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-1.7976931348623157E308", "10"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-2147483648", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-1.7976931348623157E308", "-2145386623"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-1.0000000000000002E-8", "4.9999999999999994E-51", "6"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.000000005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"48.00000001", "1.0", "58"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.139350621509523", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483647", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-1.7976931348623157E308", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-Infinity", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2147483647", "14.0", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"0", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2147483647", "14.0", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-16.999999999999996", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.0E-8", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-2147483648", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1073750016", "0.25"}, false, 14, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "0.1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1073750061", "0.25"}, false, 14, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.0", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "0.10700000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-5.3687089678E8", "-10.0"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-2147483646", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"2.1474836469999998E9", "1"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "0.09000000000000001", "Infinity", "-4194294"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-2.147483647E9", "1"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "0.09000000000000001", "Infinity", "-8388588"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623157E308", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"532676621", "1.0"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483647", "2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.368709125E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483647", "4.294967294E9"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.073741825E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "4.294967294E9"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.073741822E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "4.294967318E9"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.073741828E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"10", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.12500000000000003"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "10", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "20", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "0.0", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9361094612488218", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"1", "0.0"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-50", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"32.015625", "29"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-8"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-10", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.0E-8"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-10", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.000000005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"NaN", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "1", "1.0E-50"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-20", "2.147483640885E9"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-20", "2.147483640885E9"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.601750659039286E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-20", "2.147483640885E9"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.651272739171053E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "Infinity"}, false, 12, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "-1.0", "Infinity", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"0.12500000000000003", "2147483647"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9361094612488218", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-9.999999999999998"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.170323927037452", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-Infinity", "12.0"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "0.12500000000000003", "NaN", "-1"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "NaN", "1.0", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"NaN", "4.2949672915E9", "-2147483648"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-50"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2147483647", "-1.7976931348623157E308", "10"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"4.999999999999999E-9"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2147483647", "-1.7976931348623157E308", "10"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999975", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"2.5E-9"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2147483647", "-1.7976931348623157E308", "10"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.99999999875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.12500000000000003"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2147483647", "-1.7976931348623157E308", "10"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9361094612488218", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"2.0E-9", "1.7976931348623157E308"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "-1.7976931348623157E308", "1.0E-50", "2147483646"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "NaN", "-1.0", "41"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.0", "4.4942328371557893E307"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "32", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.14", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.0", "4.4942328371557893E307"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "32", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.14", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.12500000000000003", "4.4942328371557893E307"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "32", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.012500000000000002", "4.4942328371557893E307"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.99375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.006250000000000001", "4.4942328371557893E307"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.996875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.63625", "4.4942328371557893E307"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.681875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0E-50", "5"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "1.0"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.0E-8", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0", "156"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.0E-8", "8.988465674311579E307"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-1.0", "134"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.0E-8", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.442695042290593", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"-1", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483647", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-19.875"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.540943900902585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-7", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-4095", "-1.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2501831501831502", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-4087", "-1.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2501835086860778", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2043", "-0.43999999999999995"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11016152716593244", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2043", "-0.43999999999999995"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10994615761135583", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2043", "0.4399999999999999"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10994615761135582", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2043", "0.4489999999999999"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.11219505628976992", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623157E308", "Infinity", "0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-8", "-2147483648"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.0000000000000002", "1.0E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"1.0E-8", "1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2.0E-8", "-2147483648"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.0000000000000004", "1.0E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.12500000000000003", "1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2.0E-8", "-2147483648"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.0000000000000004", "1.0E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-0.12500000000000003", "1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2.0E-8", "-2147483648"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.0000000000000004", "1.0E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0625", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-0.25000000000000006", "Infinity"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2.0E-8", "-2147483648"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.0000000000000004", "1.0E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.12500000000000003", "2147483647", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.12500000000000003", "1.0737418235E9", "40"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"2147483647", "0.4599999"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0298863666972351E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"2.147483647E8", "0.4599999"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1465102231394129E7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"4.294967294E8", "0.4599999"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623157E308", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.217827010719799E7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"4.294967294E8", "1.77999995"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623157E308", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.000000041909516", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-4.294967294E8", "1.77999995"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623157E308", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.9999999580904846", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"2147483647", "Infinity", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623157E308", "NaN"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-1.7976931348623157E308", "20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0737418225E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-9"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "0.12500000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"5.0E-10"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-0.12500000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.99999999975", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-8"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.0E-8"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.000000005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"9.999999999999999E-9"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"9.999999999999996E-10"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.0060000010000000005"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9969969904719141", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"6.000001000000001E-4"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9996999699409872", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-6.000001000000001E-4"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0002999700589872", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.006000001000000001"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "NaN", "1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0029970094720855", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-38.0", "4194314"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.37241993712736", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-76.0", "8388528"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("17.496179567124543", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-8", "0"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-50", "-2"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-1", "0.15200000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.36870911E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-8", "0"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-50", "-2"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-1", "0.15200000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.36870912E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-8", "0"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-50", "-2"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-1", "0.15200000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1073741824", "0.12500000000000003"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.03125000002910384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"20", "1.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.2894736842105263", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.0"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "10", "1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "20", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "0.0", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"1.0E-8", "0.6250000000000001", "1073741824"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0E-8", "61"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-0.18999999", "61"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0922471226563886", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"2147483647", "6.58", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2147483647", "-1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "1", "1.0E-50"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.000000008381903", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"2.147483647E8", "6.58", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2147483647", "-1"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "1", "1.0E-50"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0000000838190335", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.0", "6.58", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2147483647", "-1"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-12.8", "68"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.876806191255398", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"1.0", "1.0", "20"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "10", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "Infinity", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.024000010000000002"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-1", "0.0"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "0.11500000000000003", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9879514100658865", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.12500000000000003"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483646", "-0.5"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "0", "0.12500000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0612733769287348", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.06250000000000001"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483646", "-0.5"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "0", "0.12500000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.03093426611965", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"2.0E-8"}, false, 11, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483646", "-0.5"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "0", "0.12500000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.99999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-9.1", "1.0E-50"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.935074856004122", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.0", "2147483647", "2147450879"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-45.99999999"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-1", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.947593853783184", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-2.147483647E9", "8.589934558E9"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "1", "-0.051000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418245E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.485", "0.12500000000000003", "7"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0", "0"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "1.0E-50", "-2147483648"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "2.1474836470000002E9", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7361740707162286", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.0"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623157E308", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.442695042290593", String.valueOf(actual));
 }
}
