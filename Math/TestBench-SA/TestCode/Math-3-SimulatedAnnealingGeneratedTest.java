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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"0.0", "134217729", "0.0", "1.304E19", "-1.0", "Infinity", "NaN", "-1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"1.0", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"1.34217729E8", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"NaN", "-1.7976931348623157E308", "Infinity", "1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, NaN, NaN, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:8>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<empty>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<empty>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:1>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:5>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:8>", "<sample:6>", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<null>", "<sample:6>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:13>", "<sample:9>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"java.lang.Comparable[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:13>", "<sample:1>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"java.lang.Comparable[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:13>", "1.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:14>", "NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:10>", "-0.15"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.15, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:5>", "-0.15"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "normalizeArray", new String[]{"double[]", "double"}, new String[]{"<sample:12>", "Infinity"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double"}, new String[]{"0.0", "3.834E-20", "-1.7976931348623157E308", "1.304E19", "NaN", "1.304E19"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"-0.15", "0.0", "3.834E-20", "-0.3", "-0.15", "0.0", "3.834E-20", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9842E-20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<sample:0>", "0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("[[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int", "int"}, new String[]{"<sample:8>", "1", "10"}, true);
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.complex.Complex;", actual.getClass().getName());
  assertEquals("[[(0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0)]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double"}, new String[]{"0.3", "134217729", "134217729", "6.71088645E7", "4.9E-324", "0.014000000000000002"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.00719942922404E15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"-0.15", "0.014000000000000002", "1.304E19", "0.3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.912E18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"0.1", "<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-0.39999999999999997", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity, 0.39999999999999997]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"14.6", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -14.6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"14.6", "<sample:14>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -14.6, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"14.6", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:11>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:11>", "<sample:10>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:11>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:14>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -2.0, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"3.834E-20", "<sample:11>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 3.834E-20, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-1.0", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:1>", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:9>", "<null>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:9>", "<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:9>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:17>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:11>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, NaN, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN, -Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:13>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<null>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0, 0.0, 2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"1.0", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-1.0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-1.0", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-14.0", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-14.0, -Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"-14.0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, -14.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"Infinity", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkPositive", new String[]{"double[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"-0.46", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:2>", "1"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]", "int"}, new String[]{"<sample:2>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equals", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[][]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scale", new String[]{"double", "double[]"}, new String[]{"1.7976931348623157E308", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.7976931348623157E308, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:5>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkRectangular", new String[]{"long[][]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double", "double", "double", "double", "double"}, new String[]{"0.0", "Infinity", "-1.7976931348623157E308", "1.0", "NaN", "-1.0", "Infinity", "-1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"double[]", "double[]"}, new String[]{"<sample:11>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"Infinity", "134217729", "1.304E19", "1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:9>", "<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:9>", "<sample:2>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "safeNorm", new String[]{"double[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4142135623730951", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:12>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeSubtract", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:8>", "<sample:4>", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:8>", "<sample:6>", "true", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:6>", "10"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math3.complex.Complex;", actual.getClass().getName());
  assertEquals("[(0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0), (0.0, 0.0)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<sample:0>", "10"}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, a, a, a, a, a, a, a, a, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean", "boolean"}, new String[]{"<sample:2>", "<null>", "true", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:13>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "double[][]"}, new String[]{"<sample:2>", "<sample:0>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2147483647, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"int[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:9>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN, NaN, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:13>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, NaN, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "convolve", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN, -Infinity, NaN, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance1", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<null>", "<sample:6>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "buildArray", new String[]{"org.apache.commons.math3.Field", "int"}, new String[]{"<null>", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NonMonotonicSequenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkOrder", new String[]{"double[]"}, new String[]{"<sample:15>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "copyOf", new String[]{"double[]", "int"}, new String[]{"<sample:0>", "-1073741824"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distanceInf", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"java.lang.Comparable[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeAdd", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeMultiply", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "ebeDivide", new String[]{"double[]", "double[]"}, new String[]{"<sample:9>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "sortInPlace", new String[]{"double[]", "double[][]"}, new String[]{"<sample:10>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<null>", "<sample:7>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"double[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<empty>", "<sample:9>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "checkNonNegative", new String[]{"long[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "isMonotonic", new String[]{"java.lang.Comparable[]", "org.apache.commons.math3.util.MathArrays$OrderDirection", "boolean"}, new String[]{"<empty>", "<sample:2>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:12>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"1.34217729E8", "<sample:6>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"2.68435458E8", "<sample:6>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "scaleInPlace", new String[]{"double", "double[]"}, new String[]{"1.0", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"1.7976931348623157E308", "Infinity", "Infinity", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"1.7976931348623157E308", "Infinity", "Infinity", "-1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"-Infinity", "Infinity", "Infinity", "-1.0000000000000002"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "equalsIncludingNaN", new String[]{"float[]", "float[]"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "linearCombination", new String[]{"double", "double", "double", "double"}, new String[]{"Infinity", "-2.6080000000000003E20", "-6.15", "-1.304E19"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483646E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483646E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483644E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.util.MathArrays", "distance", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8284271247461903", String.valueOf(actual));
 }
}
