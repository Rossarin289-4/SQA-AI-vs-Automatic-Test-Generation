package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"NaN", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"4.9E-324", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"Infinity", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.1474836466E9", "0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418233E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"Infinity", "1.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"4.9E-324", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "NaN", "0.0", "1.0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "-1.0", "-1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.5", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.0", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"4.294967294E9", "8.988465674311579E307"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.4942328371557893E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:0>", "NaN", "4.9E-324", "NaN", "1073741823"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2147483647", "-0.6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418232E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.441", "40.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.2205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.0", "2.1474836484000006E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418242000003E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "NaN", "0.5000000000000001", "2.147483647E8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-0.06", "0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.03", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "NaN", "10.0", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.0", "Infinity", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"Infinity", "5.9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:4>", "6.300000000000001", "4.9E-324", "NaN", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:0>", "-0.5", "NaN", "1.0", "1073741823"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.496", "-2.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.752", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"1.0000000000000002", "4.9E-324"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "0.24999999999999997", "-Infinity", "2147483647", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.75, 1.25]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.0", "2.0000000000000004"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "0.0", "-0.25", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.25, 0.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-2.0000000000000004", "31.25", "-3.6000000000000005"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0000000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "2.5", "-0.5", "10.0", "2147467239"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.5, 3.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.0", "26.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("13.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.0", "-0.1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.05", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-0.032", "0.4420000000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20500000000000007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "-2.147483647E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.07374182325E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-0.5", "6.835000000000001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1675000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "12.600000000000001", "NaN", "0.448"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.600000000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "-1.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.0000000000000004", "10.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-0.0", "0.25", "-Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"NaN", "1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.24999999999999994", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "4.0", "1.0", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[3.0, 5.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"6.300000000000001", "4.9E-324"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1500000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "8.000000000000002", "4.29496729282E9", "-Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.000000000000002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"2.1474836469999998E9", "-Infinity"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:0>", "NaN", "10.0", "34.0", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.49999999999999994"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"34.00000000000001", "0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("17.000000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "NaN", "2147483647", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "12.600000000000001", "0.1", "20.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[11.600000000000001, 13.600000000000001]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "340.026", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("340.026", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.0000000000000002", "0.0", "4.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.220446049250313E-16, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "2147483647", "NaN", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 2.147483647E9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "Infinity", "NaN", "1.1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308", "NaN", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"-1.026", "-1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.20000000000000004", "17.0", "6.300000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20000000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "1.0000000000000002", "0.9999999999999999", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.9999999999999999, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-6.300000000000001", "-Infinity", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-7.300000000000001, -5.300000000000001]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "6.300000000000002", "0.4000000000000001", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[5.300000000000002, 7.300000000000002]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "2.0000000000000004", "24.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0000000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "midpoint", new String[]{"double", "double"}, new String[]{"0.5", "17.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "0.6000000000000014", "630.0000000000001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6000000000000014", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "5.0", "-10.000000000000002", "1.7976931348623157E308", "4"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[4.0, 6.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.025", "NaN", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 1.025]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "2.5E-323", "0.9999999999999999", "0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5E-323", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "10.0", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "NaN", "6.3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-2.0000000000000004", "-0.12499999999999999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0000000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "2.0000000000000004", "NaN", "2.1474836419E9"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 3.0000000000000004]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "553.0", "1.0", "Infinity", "1073741857"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[552.0, 554.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "68.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("68.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "NaN", "4.9E-324", "Infinity", "75"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:5>", "NaN", "-10.0", "1.35", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "2147483647", "2.3200000000000003", "2147483647", "10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.147483646E9, 2.147483647E9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "0.9999999999999999", "-34.0", "1.7976931348623157E308", "524308"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.1102230246251565E-16, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.0", "3.9999999999999996"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "3.1500000000000004", "2.147483647E8", "-1.7976931348623158E307"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1500000000000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "Infinity", "0.49999999999999994", "NaN", "1"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "NaN", "9.7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "NaN", "-3.5953862697246315E307", "Infinity", "1073741787"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "1.0", "-1.0", "28.0", "524289"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-Infinity", "-Infinity", "NaN", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "6.300000000000002", "-0.01", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[5.300000000000002, 7.300000000000002]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "Infinity", "NaN", "-Infinity"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "3.15", "-Infinity", "8.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.15, 4.15]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "2.1474836464E9", "-1.0", "Infinity", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.1474836454E9, 2.1474836474E9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:7>", "34.0", "NaN", "Infinity", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 35.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "0.034", "-0.49999999999999994", "Infinity", "134221823"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.49999999999999994, 1.034]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "NaN", "-1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-28.0", "NaN", "-10.0", "2147483587"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -27.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:1>", "1.0E-323", "-0.9999999999999999", "Infinity", "10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.0", "0.0", "NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-4.9E-324", "10.0", "-1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "18.0", "-16.75", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[17.0, 19.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "-1.0", "-1.0", "0.0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.49999999999999994", "1.0737418235E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.49999999999999994", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-0.5", "-1.7976931348623157E308", "-0.0", "5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.5, -0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "6.1899999999999995", "6.300000000000002"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.1899999999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "Infinity", "2147483647", "Infinity"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-2.147483647E9", "-1.7976931348623157E308", "5.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.147483648E9, -2.147483646E9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.3", "6.220000000000001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "6.300000000000002", "-10.0", "40.0", "20"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[5.300000000000002, 7.300000000000002]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "-4.9E-324", "-0.9999999999999999", "Infinity", "2147483583"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.9999999999999999, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "0.0", "-5.0", "0.89", "536870911"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.89]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "Infinity", "1.7976931348623157E308"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "bracket", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "int"}, new String[]{"<sample:2>", "NaN", "0.0", "Infinity", "2147483518"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
}
