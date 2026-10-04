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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<null>", "-1.0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:0>", "-1.0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2D", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:0>", "Infinity", "0.0", "10", "<s:key>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:6>", "<null>", "<sample:0>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:3>", "<s:;>"}, true), new String[][]{{"insertValue", "int,java.lang.Comparable,java.lang.Number", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"1.5e300", "1L", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=3, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:4>", "-1.7976931348623157E308", "0.0", "-2147483648", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:2>", "<i:-2147483648>", "1.7976931348623158E307", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"+1", "", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=3, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<null>", "<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:1>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<sample:9>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:8>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<null>", "<sample:9>", "<sample:3>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateCategoryRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:3>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:5>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<s:;>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:7>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:0>", "NaN"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "1.7976931348623157E308"}, true), new String[][]{{"constrain", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:3>", "<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,5.0] {getCentralValue=2.5, getLength=5.0, getLowerBound=0.0, getUpperBound=5.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<null>", "NaN", "1.7976931348623158E307", "-2147483648", "<b:true>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<null>", "<sample:0>", "<sample:7>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<empty>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:4>", "1.0", "Infinity", "1", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2D", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "1.7976931348623158E307", "10", "<s:>"}, true), new String[][]{{"indexOf", "java.lang.Comparable", "5"}, {"getDomainLowerBound", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:2>", "<b:true>", "-Infinity"}, true, 0, null, 2), new String[][]{{"getGroup", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-1.0,-1.0] {getCentralValue=-1.0, getLength=0.0, getLowerBound=-1.0, getUpperBound=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:11>"}, true, 0, null, 2), new String[][]{{"getUpperBound", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:11>"}, true, 0, null, 2), new String[][]{{"intersects", "double,double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"getLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<s::T>"}, true, 0, null, 2), new String[][]{{"insertValue", "int,java.lang.Comparable,java.lang.Number", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:4>", "-1.7976931348623157E308", "0.0", "-2147483648", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:7>", "1.7976931348623157E308"}, true, 0, null, 1), new String[][]{{"getUpperBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308"}, true, 0, null, 1), new String[][]{{"getUpperBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:1>", "1"}, true, 0, null, 2), new String[][]{{"getIndex", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:7>", "-2147483648"}, true, 0, null, 2), new String[][]{{"getIndex", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:0>", "57"}, true, 0, null, 2), new String[][]{{"getIndex", "java.lang.Comparable", "7"}, {"validateObject", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:7>", "-24"}, true, 0, null, 2), new String[][]{{"getIndex", "java.lang.Comparable", "7"}, {"validateObject", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<null>", "-24"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:4>", "Infinity"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<null>", "NaN"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:5>", "-1.0"}, true, 0, null, 2), new String[][]{{"getUpperBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:4>", "<i:-2147483648>", "1.7976931348623157E308", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:4>", "<d:1.5>", "1.7976931348623158E307", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:7>", "<null>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true, 0, null, 3), new String[][]{{"getLength", "", "7"}, {"getLowerBound", "", "1"}, {"constrain", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:1>", "<i:-2147483648>", "-53.0", "-10"}, true, 0, null, 3), new String[][]{{"getKeys", "", "1"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:4>", "<i:-536870912>", "-1.7976931348623155E308", "-2147483648"}, true, 0, null, 3), new String[][]{{"removeChangeListener", "org.jfree.data.event.DatasetChangeListener", "5"}, {"getItemCount", "", "7"}, {"clone", "", "7"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, true, 0, null, 3), new String[][]{{"constrain", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, true, 0, null, 3), new String[][]{{"constrain", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "false"}, true, 0, null, 3), new String[][]{{"intersects", "org.jfree.data.Range", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:7>", "<sample:8>", "false"}, true, 0, null, 3), new String[][]{{"intersects", "org.jfree.data.Range", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:0>", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:7>", "<s:\tEa>", "Infinity", "2147483647"}, true, 0, null, 3), new String[][]{{"getGroup", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:7>", "<s:\tEb>", "Infinity", "2147483620"}, true, 0, null, 3), new String[][]{{"getGroup", "", "0"}, {"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:4>", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "true"}, true, 0, null, 1), new String[][]{{"constrain", "double", "5"}, {"intersects", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true, 0, null, 1), new String[][]{{"constrain", "double", "5"}, {"intersects", "double,double", "1"}, {"getLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:1>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true, 0, null, 1), new String[][]{{"getUpperBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2D", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:0>", "1.0", "Infinity", "-1", "<s:key>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:;>"}, true, 0, null, 3), new String[][]{{"getSelectionState", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:1>", "<s:>"}, true, 0, null, 3), new String[][]{{"getKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"intersects", "org.jfree.data.Range", "3"}, {"constrain", "double", "4"}, {"getUpperBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:5>", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-1.0,-1.0] {getCentralValue=-1.0, getLength=0.0, getLowerBound=-1.0, getUpperBound=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:3>", "1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:6>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:10>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:3>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:3>", "44"}, true), new String[][]{{"setValue", "java.lang.Comparable,java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:3>", "63"}, true), new String[][]{{"getKeys", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:1>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:>"}, true), new String[][]{{"insertValue", "int,java.lang.Comparable,java.lang.Number", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true), new String[][]{{"getUpperBound", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true), new String[][]{{"getUpperBound", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true), new String[][]{{"getUpperBound", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true), new String[][]{{"getUpperBound", "", "4"}, {"contains", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true), new String[][]{{"getLength", "", "4"}, {"contains", "double", "7"}, {"intersects", "org.jfree.data.Range", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:0>", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:1>", "0"}, true), new String[][]{{"setSelected", "java.lang.Comparable,boolean,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<null>", "-8388582"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:6>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:5>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:3>", "-1.7976931348623157E308"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:7>", "1.7976931348623157E308"}, true), new String[][]{{"getUpperBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:6>", "<i:2>", "1.7976931348623157E308", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:6>", "<i:0>", "1.7976931348623157E308", "2013265919"}, true), new String[][]{{"isSelected", "java.lang.Comparable", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"0xFFFFFFFF", "a", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<sample:6>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"1.5", "", "<sample:1>"}, true), new String[][]{{"incrementValue", "double,java.lang.Comparable,java.lang.Comparable", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:6>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:7>", "10"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:2>", "<i:0>", "-1.0", "-2147483647"}, true), new String[][]{{"getKeys", "", "1"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:0>", "1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:4>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:6>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[Infinity,Infinity] {getCentralValue=Infinity, getLength=NaN, getLowerBound=Infinity, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:10>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true), new String[][]{{"contains", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:7>", "<s:>", "Infinity", "0"}, true), new String[][]{{"hasListener", "java.util.EventListener", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:5>", "<s:<ssg>", "Infinity", "0"}, true), new String[][]{{"getGroup", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<null>", "<s:;>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:7>", "<sample:9>", "<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:4>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:1>", "<i:-2147483648>", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:4>", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:8>", "<s::>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<null>", "<s:-s>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:7>", "<d:1.5>"}, true), new String[][]{{"getKey", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "Infinity"}, true), new String[][]{{"constrain", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "-Infinity"}, true), new String[][]{{"constrain", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:3>", "Infinity"}, true), new String[][]{{"constrain", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:8>", "1.7976931348623158E307"}, true), new String[][]{{"constrain", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623158E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:8>", "Infinity"}, true), new String[][]{{"constrain", "double", "3"}, {"intersects", "double,double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "3"}, {"constrain", "double", "4"}, {"getUpperBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"intersects", "org.jfree.data.Range", "3"}, {"constrain", "double", "4"}, {"getUpperBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<null>", "<s::>", "0.0", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:2>", "<s:;>", "-0.5", "-1073741824"}, true), new String[][]{{"setValue", "java.lang.Comparable,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:1>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<s:key>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:7>", "<i:-2147483648>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:6>", "<sample:1>", "<sample:3>"}, true), new String[][]{{"getValue", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, true), new String[][]{{"getColumnKeys", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[b, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:6>", "<sample:4>", "<sample:0>"}, true), new String[][]{{"getColumnKeys", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true), new String[][]{{"contains", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true), new String[][]{{"contains", "double", "5"}, {"getCentralValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true, 0, null, 2), new String[][]{{"contains", "double", "5"}, {"getCentralValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<i:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true), new String[][]{{"contains", "double", "5"}, {"getCentralValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<sample:6>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<sample:6>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<sample:6>", "true"}, true, 0, null, 2), new String[][]{{"getUpperBound", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>", "true"}, true, 0, null, 2), new String[][]{{"intersects", "double,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>", "true"}, true, 0, null, 2), new String[][]{{"intersects", "double,double", "2"}, {"intersects", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:7>", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[Infinity,Infinity] {getCentralValue=Infinity, getLength=NaN, getLowerBound=Infinity, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "NaN"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:0>", "8.988465674311579E307"}, true), new String[][]{{"getLowerBound", "", "6"}, {"getCentralValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "8.988465674311579E307"}, true, 0, null, 2), new String[][]{{"getLowerBound", "", "6"}, {"getCentralValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:8>", "8.988465674311579E307"}, true, 0, null, 2), new String[][]{{"getLowerBound", "", "6"}, {"getCentralValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:8>", "0.0"}, true, 0, null, 2), new String[][]{{"getLowerBound", "", "6"}, {"getCentralValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:8>", "0.0"}, true, 0, null, 2), new String[][]{{"getLowerBound", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:6>", "0.0"}, true, 0, null, 2), new String[][]{{"getLowerBound", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:3>", "4.9E-324"}, true, 0, null, 2), new String[][]{{"getLowerBound", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:3>", "4.9E-324"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[4.9E-324,1.0] {getCentralValue=0.5, getLength=1.0, getLowerBound=4.9E-324, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:8>", "4.9E-324"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[4.9E-324,5.0] {getCentralValue=2.5, getLength=5.0, getLowerBound=4.9E-324, getUpperBound=5.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:7>", "4.9E-324"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[4.9E-324,4.9E-324] {getCentralValue=0.0, getLength=0.0, getLowerBound=4.9E-324, getUpperBound=4.9E-324}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:2>", "-8.988465674311579E307"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "2"}, {"getCentralValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateCategoryRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
}
