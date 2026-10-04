package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double"}, new String[]{"Infinity", "1.0", "0.0", "3.834E-19", "1.3421772899999998E9", "134217729"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"1.0700000000000003", "1.7976931348623155E308", "-0.0", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"-1.7976931348623157E308", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "1.0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:6>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"1.34217729E8", "-0.0", "-1.0", "1.7976931348623157E308", "-0.47000000000000003", "1.3421772899999998E9", "1.7976931348623157E308", "1.3421772899999998E10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-0.4700000000000001", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity, 0.4700000000000001]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"java.lang.Comparable[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "1.3421772900000003E8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:6>", "1.3421772897999998E10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, NaN, Infinity, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"-1.1020000000000003", "-0.0", "3.834E-19", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.834E-19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "false", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:7>", "<sample:3>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:6>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"java.lang.Comparable[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:12>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:10>", "Infinity"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:13>", "<sample:3>", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:8>", "<sample:1>", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:13>", "<sample:4>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double"}, new String[]{"-2.0", "-0.47000000000000003", "134217729", "-189.3", "6.710886449E9", "2.6843545799999996E10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.8014398772692343E20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:15>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<sample:5>", "100663269", "-2097158"}, true);
  assertNotNull(actual);
  assertEquals("[[Ljava.lang.Object;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<sample:9>", "11", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[[Ljava.util.Map;", actual.getClass().getName());
  assertEquals("[[], [], [], [], [], [], [], [], [], [], []]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"2.2040000000000006", "1.3421772899999995E9", "1.3421772899999998E9", "4.280000000000001", "3.834E-19", "1.3421772894000003E8", "-1.0000000000000002", "-2.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.70267755036E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:0>", "-2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"6.71088645E7", "<sample:11>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"-1.3421772899999998E10", "<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:13>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "false", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:10>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"0.47000000000000014", "<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-1.304E19", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, -1.304E19]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:10>", "-4.7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-4.7, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:5>", "65525"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:12>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:3>", "100663269"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:6>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:12>", "<sample:0>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:12>", "<sample:3>", "false", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:7>", "<sample:7>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:9>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:13>", "<sample:4>", "<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:1>", "100663269"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:12>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"0.0", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8284271247461903", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"1.34217729E9", "1.304E19", "0.0", "2.608E19", "-0.9999999999999999", "3.834E-19", "1.7976931348623157E308", "NaN"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<empty>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:12>", "<sample:7>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:3>", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:11>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:14>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "-1.7976931348623157E308"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, -1.7976931348623157E308]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"Infinity", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"1.304E19", "-2.0", "10.700000000000003", "-1.0", "3.834E-18", "-Infinity", "Infinity", "2.6843545799999995E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<null>", "65537", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<null>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:7>", "<sample:2>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<empty>", "-65537"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:7>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:2>", "-2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:0>", "10"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"Infinity", "-1.7976931348623157E308", "2.6843545799999996E10", "1.0700000000000003", "2.6843545742999996E10", "3.834E-19", "-Infinity", "1.3421772900000004E7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:4>", "<sample:5>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<null>", "131074"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:13>", "<sample:0>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"3.834E-19", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[3.834E-19, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -Infinity, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8284271247461903", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:3>", "65536"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<null>", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:5>", "1"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"1.7976931348623157E308", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:5>", "<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"-0.0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483646E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<empty>", "<sample:1>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "-0.47000000000000003"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.47000000000000003]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-3.834E-19", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<empty>", "<sample:3>", "false", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double"}, new String[]{"-1.0", "-1.34217729E9", "NaN", "3.834E-20", "-0.0", "1.3421772900000002E9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"-0.0", "8.988465674311578E307", "1.7976931348623157E308", "-0.9999999999999999", "Infinity", "1.3421772900000003E8", "1.3421772790000004E8", "134217729"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:2>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:12>", "<sample:3>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "2.6843545800000006E8"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.6843545800000006E8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"0.0", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:14>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<null>", "16777217", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:11>", "<sample:1>", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:11>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "1.7976931348623155E308"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.7976931348623155E308]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:0>", "0"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<sample:2>", "-1", "100663269"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4142135623730951", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"0.0", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "1"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:11>", "<sample:14>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, 2.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:2>", "33"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:5>", "16777217"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:15>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"1.7976931348623157E308", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.7976931348623157E308, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double"}, new String[]{"-1.7976931348623157E308", "1.0700000000000005", "-0.061", "1.3421772900000003E8", "1.0300000000000002", "-0.047"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"0.48", "134217729", "1.1020000000000003", "-1.3421772900000003E8", "1.0700000000000003", "-2.6843545795999996E10", "1.7976931348623155E308", "0.55"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.887312241742736E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "6.710886449999999E8"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 6.710886449999999E8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:3>", "10"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<null>", "<sample:6>", "false", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483645E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"0.5", "<sample:13>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:14>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:10>", "1.304E19"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.304E19, -0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:15>", "<sample:13>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483643E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "0"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:4>", "<sample:6>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "1.3421772899999998E10"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.3421772899999998E10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4142135623730951", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"-0.47000000000000003", "1.34217729E9", "0.0", "-0.24550000000000002", "1.0", "-1.7976931348623157E308", "7.668E-21", "-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:13>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"-0.8600000000000001", "-0.4700000000000001", "0.0", "-4.9E-324"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4042000000000001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:12>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483646E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:13>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0710678118654755", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:12>", "<sample:1>", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"NaN", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "1.3421772900000006E8"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.3421772900000006E8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:15>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:10>", "-0.0235"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0235, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483644E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:13>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:18>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "-0.4700000000000001"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<null>", "<sample:7>", "false", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"1.3421772899999998E10", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.3421772899999998E10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
