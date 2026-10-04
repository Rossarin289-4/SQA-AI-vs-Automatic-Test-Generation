package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.0", "1.7976931348623157E308", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-31.0", "1.7976931348623157E308", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-31.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-62.0", "1.7976931348623157E308", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-62.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-6.2", "1.7976931348623157E308", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.0", "1.797693134862316E307", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:4>", "NaN", "2147483647", "NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "NaN", "2.147483647E11", "NaN"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:5>", "NaN", "2.147483647E11", "NaN"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0", "-0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0", "-0.05"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.525", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0", "0.05000000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.475", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.0", "0.05000000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.525", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "0.05000000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.275", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.07374182375E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "2.14748364752E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.07374182401E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"NaN", "-2.2800000000000002"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-Infinity", "-2.335"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.0", "-1.1675"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.08374999999999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.0", "-5.7675"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.38375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"Infinity", "-5.7675"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-5.7675"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-Infinity", "8.5899345880012E11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"Infinity", "-8.5899345880052E11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.0", "-4.294967294002601E11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.1474836469963004E11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"Infinity", "-Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "-1.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "2147483647", "Infinity", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483647E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "2.147483647E8", "Infinity", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483647E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "2.14748364732E8", "Infinity", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.14748364732E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "2.1474836473200002E8", "Infinity", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1474836473200002E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-2.1474836881000003E8", "Infinity", "4.294967294E11"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.1474836881000003E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.0737418440500002E8", "Infinity", "8.5899345875E12"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0737418440500002E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.0", "-1.7976931348623157E308", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.0", "-1.7976931348623157E308", "0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.0", "-1.7976931348623157E308", "-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.0", "-1.7976931348623157E308", "-0.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-13.0", "-1.7976931348623157E308", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-14.0, -12.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-13.000000000000002", "-1.7976931348623157E308", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-14.000000000000002, -12.000000000000002]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-26.000000000000004", "-8.988465674311579E307", "0.654"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-27.000000000000004, -25.000000000000004]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-12.972000000000001", "-8.988465674311579E307", "0.654"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-13.972000000000001, -11.972000000000001]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-12.972000000000001", "-8.988465674311579E306", "2.1474836469999998E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-13.972000000000001, -11.972000000000001]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.2972000000000001", "-8.988465674311579E306", "2.1474836469999998E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.2972, -0.29720000000000013]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.2972000000000001", "-8.988465674311579E306", "2.1474836469999998E9"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.2972, -0.29720000000000013]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.2972000000000001", "-8.988465674311579E306", "2.1474836469999998E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.2972, -0.29720000000000013]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.9972000000000003", "-8.988465674311579E306", "2.1474836469999998E9"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.9972000000000003, -0.9972000000000003]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.9752000000000003", "-8.988465674311579E306", "2.1474836469999998E9"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.9752, -0.9752000000000003]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.9752000000000005", "-8.988465674311579E306", "4.294967306799999E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.9752000000000005, -0.9752000000000005]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-2.1474836470000003E11", "-2.3000000000000007"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0737418235115001E11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0737418257733805E9", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0737418257733805E9", "0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.368709128866903E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0737418257733805E9", "1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.368709123866903E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0737418257733805E9", "0.98"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.368709123966902E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.0737418243733804E9", "0.98"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.368709126766902E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.147483648746761E9", "0.98"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418248633804E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.147483648746761E9", "0.49"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418246183803E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.147483644146761E9", "0.49"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418223183805E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:4>", "-1.0", "NaN", "2147483647", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "NaN", "-1.7976931348623157E308", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "NaN", "-1.7976931348623157E308", "524289"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -1.7976931348623157E308]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-0.37949999999999995", "2.147483646953E11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418234746025E11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-0.18974999999999995", "2.147483646995E11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418234965512E11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "NaN", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -1.7976931348623157E308]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.7976931348623158E307", "NaN", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -1.7976931348623158E307]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-8.988465674311579E306", "NaN", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -8.988465674311579E306]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "2.147483647E11", "NaN", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 2.14748364701E11]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308", "NaN", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 1.7976931348623157E308]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308", "0.5", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.7976931348623157E308, 1.7976931348623157E308]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "Infinity", "NaN", "-0.504"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308", "NaN", "-1.008"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "8.988465674311579E307", "NaN", "7.992"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "NaN", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-Infinity", "NaN", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "NaN", "NaN", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "NaN", "Infinity", "NaN"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "3.3", "Infinity", "-1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.3325", "Infinity", "-3.7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3325", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-23.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-23.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.25", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.241", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.241", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.5", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.8", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.8", "2.147483647579E10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.8", "1.0737418237894998E11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.0", "1.0737418237894998E11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "55.0", "1.0737418237894998E11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("55.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "113.1", "2.1474836476309998E11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("113.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "NaN", "0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "1.7976931348623157E308"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-8.988465674311579E307", "Infinity"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-1.797693134862316E307", "0.11639999999999999"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.797693134862316E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-1.0", "1.7976931348623157E308"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "55.0", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("55.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-55.0", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-55.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-27.5", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-27.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623155E308", "-2.14748364681006E11", "-0.6100000000000001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "1.0737419685000001E8", "33.75000000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-8.988465674311579E306", "1.0737418208999999E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557894E306", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "NaN", "-1.0", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "NaN", "NaN", "NaN"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "NaN", "NaN", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "NaN", "2.1474836469E11", "NaN"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "NaN", "2.1474836468952E11", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "0.5", "0.5", "1.7976931348623157E308", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.5, 1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-2.0", "2.147483647022E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.0", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "0.0", "-1.0", "0.0", "1"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "NaN", "1.7976931348623157E308", "Infinity", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:1>", "NaN", "1.7976931348623155E308", "Infinity", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-Infinity", "NaN", "2.147483647E11"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "0.5", "-1.0", "2147483647", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.5, 1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "0.5", "-1.0", "2147483647", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.5, 1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "36.4", "-0.53", "2.14748364645E9", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[35.4, 37.4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "18.2", "-16.53", "2.14748394645E8", "2147483635"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[17.2, 19.2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "18.2", "-16.53", "2.14748394645E8", "2147483635"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[17.2, 19.2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "18.200000000000003", "-51.07", "2.14748394645E8", "2147483635"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[17.200000000000003, 19.200000000000003]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "36.400000000000006", "-46.17000000000001", "2.14748394645E8", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[35.400000000000006, 37.400000000000006]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "364.00000000000006", "-46.17000000000001", "NaN", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[363.00000000000006, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:9>", "36.400000000000006", "-46.17000000000001", "NaN", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "1.8200000000000003", "0.48", "NaN", "20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.8200000000000003, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "1.8200000000000003", "1.0", "NaN", "32"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "1.8200000000000003", "-0.35", "NaN", "8"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.8200000000000003, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:9>", "1.82", "0.06999999999999999", "NaN", "27"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "1.4409999999999998", "0.48", "NaN", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.48, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.4617000000000001", "1.0737418199E9", "36.400000000000006"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4617000000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-6.02", "-0.5", "0.18742500000000004"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.02", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-8.988465674311579E306", "Infinity", "-4.4942328371557893E307"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E306", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "Infinity", "NaN", "Infinity"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "1.0E-323", "NaN", "2.1474836470027E10", "4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "4.2949672951359997E9", "NaN", "4.294967293505399E10", "2097154"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 4.294967296136E9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-Infinity", "NaN", "-230.85000000000005", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "2.147483647E11", "0.0", "2.147483647E11", "2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.14748364699E11, 2.147483647E11]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.0", "Infinity", "48.77000000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-46.17000000000001", "Infinity", "1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-46.17000000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "46.17000000000001", "Infinity", "1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("46.17000000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-253.85000000000002", "Infinity", "-4.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-253.85000000000002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-126.92500000000001", "Infinity", "-4.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-126.92500000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "1.0", "-46.17000000000001", "2147483647", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "1.9", "-46.17000000000001", "2147483647", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.8999999999999999, 2.9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "-9.7", "-19.225", "2.1474836470000003E7", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-10.7, -8.7]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "NaN", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "Infinity", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "1.7976931348623157E308", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-Infinity", "-8.988465674311579E307"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "-8.988465674311579E307"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-1.1239999999999994", "-0.08080000000000001", "0.87"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1239999999999994", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-0.5619999999999997", "-0.040400000000000005", "1.74"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5619999999999997", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "Infinity", "0.0", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-23.085000000000004", "-46.17000000000001", "-1.0199999999999998", "2147483633"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-24.085000000000004, -22.085000000000004]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-23.625000000000004", "-46.17000000000001", "-1.0199999999999998", "2147483633"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-24.625000000000004, -22.625000000000004]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-23.667000000000005", "-46.17000000000001", "-1.0199999999999998", "2147483633"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-24.667000000000005, -22.667000000000005]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-0.025", "-68.612", "361.68"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.025, 0.975]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.036", "-68.612", "361.68"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.964, 1.036]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.017999999999999995", "-68.612", "361.68"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.982, 1.018]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-24.632999999999996", "-45.58600000000001", "2.8012500000000005"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-25.632999999999996, -23.632999999999996]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "700.0000000000001", "-3.595386269724631E307", "NaN"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[699.0000000000001, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.0", "NaN", "36.400000000000006"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "2.14748364717E11", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.14748364717E11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "2.14748364717E10", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.14748364717E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "2.1474836475399998E10", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1474836475399998E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.0737418237699999E10", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418237699999E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.8199999999999996", "-1.5568624999999998", "211.26000000000002"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.8199999999999996, 2.8199999999999994]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "1.0", "NaN", "4.294967293999999E11", "40"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-5.4", "2.147483647E11"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-2.7", "4.294967294E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "35.3", "4.294967294E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("35.3", String.valueOf(actual));
 }
}
