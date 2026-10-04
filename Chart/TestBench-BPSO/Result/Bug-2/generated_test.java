package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"{\"a\":1~Null 'xRange' argument", ".5", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:3>", "<i:-2147483648>", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<null>", "NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:3>", "-2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:8>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateCategoryRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:1>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<s:bT>"}, true), new String[][]{{"sortByKeys", "org.jfree.chart.util.SortOrder", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<s:bT>"}, true, 0, null, 2), new String[][]{{"setSelected", "java.lang.Comparable,boolean,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:2>", "NaN"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:4>", "-0.0", "-1.7976931348623157E308", "33554442", "<i:-1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"1e101.50x123456789", "-c0.0", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=3, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<null>", "<s:kel>", "8.0", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:3>", "NaN", "1.53", "-1073741824", "<i:-1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:9>", "<sample:2>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, true), new String[][]{{"intersects", "double,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:0>", "<sample:0>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:4>", "<null>", "<sample:6>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:3>", "<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,0.0] {getCentralValue=-Infinity, getLength=Infinity, getLowerBound=-Infinity, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"getUpperBound", "", "7"}, {"constrain", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<s:a>", "<sample:10>"}, true), new String[][]{{"hasListener", "java.util.EventListener", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<null>", "<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:3>", "<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:2>", "10.0", "-1.7976931348623157E308", "33554442", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:2>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:2>", "<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<b:true>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:6>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:10>", "<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "<sample:8>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<null>", "8.0", "-1.7976931348623157E308", "0", "<i:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2D", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:2>", "NaN", "Infinity", "119", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeriesCollection", actual.getClass().getName());
  assertEquals("{getIntervalPositionFactor=0.5, getIntervalWidth=1.0, getSeriesCount=1, isAutoWidth=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:2>", "<s:1>", "-4.9E-324", "-2147483648"}, true, 0, null, 1), new String[][]{{"getGroup", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<i:-2147483648>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"true ", "g147483648", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:2>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "-54.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-54.0] {getCentralValue=-Infinity, getLength=Infinity, getLowerBound=-Infinity, getUpperBound=-54.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateCategoryRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:5>", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:1>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:2>", "-2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:2>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:6>", "<i:0>"}, true, 0, null, 1), new String[][]{{"sortByKeys", "org.jfree.chart.util.SortOrder", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<s:kez>"}, true, 0, null, 3), new String[][]{{"insertValue", "int,java.lang.Comparable,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<null>", "<d:1.5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<i:-2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<null>", "-8.0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"{\"a\":1~Null 'xRange' argulent", "null\u00e9", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<b:true>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:3>", "<i:-2147483648>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<s:bT>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"removeRow", "java.lang.Comparable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:7>", "8.000000000000002", "NaN", "28", "<s:fT>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=28, getMaxX=NaN, getMaxY=0.0, getMaximumItemCount=2147483647, getMinX=NaN, getMinY=0.0, getNotify=true, isEmpty=fals...#202#342097228", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:2>", "<d:-47.5>", "-0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:2>", "-Infinity"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:6>", "33554450"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:6>", "4.6000000000000005"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:0>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2D", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:3>", "8.0", "1.53", "-2", "<b:true>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:5>", "2097172"}, true, 0, null, 2), new String[][]{{"setGroup", "org.jfree.data.general.DatasetGroup", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"123456789012345678901234567890", "J", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:8>", "-119"}, true, 0, null, 2), new String[][]{{"fireSelectionEvent", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"TJTLF", "a b", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getColumnIndex", "java.lang.Comparable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"getCentralValue", "", "2"}, {"contains", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:8>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"intersects", "org.jfree.data.Range", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:5>", "-16"}, true, 0, null, 1), new String[][]{{"getValue", "int", "6"}, {"isSelected", "java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:9>", "<sample:4>", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>", "false"}, true, 0, null, 3), new String[][]{{"intersects", "double,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<null>", "<sample:3>", "<sample:0>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "-2.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-2.0] {getCentralValue=-Infinity, getLength=Infinity, getLowerBound=-Infinity, getUpperBound=-2.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"intersects", "org.jfree.data.Range", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:2>", "<i:1>", "-1.0", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<sample:0>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"1.1245678:01234567", "-c00", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getColumnCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:5>", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:3>", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:1>", "2147483641"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<i:-2147483648>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:1>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:5>", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-1.0] {getCentralValue=-Infinity, getLength=Infinity, getLowerBound=-Infinity, getUpperBound=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:0>", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"/a/b", "1", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:6>", "<i:-2147483648>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:6>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"Ii", "/a/b", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:3>", "<s:>", "-0.0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable[]", "java.lang.Comparable[]", "double[][]"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:1>", "-35"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<i:1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.category.DefaultCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:0>", "<i:-4>", "-Infinity", "-2147483648"}, true), new String[][]{{"getIndex", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:8>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:0>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumStackedRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:4>", "<sample:8>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:4>", "-2"}, true), new String[][]{{"getIndex", "java.lang.Comparable", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:0>", "<s:cT>", "-1.7976931348623157E308"}, true), new String[][]{{"isSelected", "java.lang.Comparable", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculatePieDatasetTotal", new String[]{"org.jfree.data.pie.PieDataset"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<d:1.5>"}, true), new String[][]{{"hasListener", "java.util.EventListener", "1"}, {"sortByValues", "org.jfree.chart.util.SortOrder", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true), new String[][]{{"intersects", "double,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:9>", "false"}, true), new String[][]{{"getLowerBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:6>", "<i:7>", "-1.7976931348623157E308", "2147483618"}, true), new String[][]{{"hasListener", "java.util.EventListener", "3"}, {"setSelectionState", "org.jfree.data.pie.PieDatasetSelectionState", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:1>", "<i:0>", "1.7976931348623157E308", "1"}, true), new String[][]{{"setValue", "java.lang.Comparable,java.lang.Number", "5"}, {"getValue", "java.lang.Comparable", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:0>", "0.0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.7976931348623157E308,1.7976931348623157E308] {getCentralValue=1.7976931348623157E308, getLength=0.0, getLowerBound=1.7976931348623157E308, getUpperBound=1.7976931348623157E308}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<null>", "33554442"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:1>", "<s:key>"}, true), new String[][]{{"removeChangeListener", "org.jfree.data.event.DatasetChangeListener", "5"}, {"remove", "java.lang.Comparable", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:5>", "NaN", "8.000000000000002", "119", "<i:-2147483648>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.xy.XYSeries", actual.getClass().getName());
  assertEquals("{getAllowDuplicateXValues=true, getAutoSort=true, getDescription=null, getItemCount=119, getMaxX=NaN, getMaxY=-Infinity, getMaximumItemCount=2147483647, getMinX=NaN, getMinY=-Infinity, getNotify=true,...#215#-473085761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findCumulativeRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2D", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:1>", "-3.3000000000000003", "0.0", "-8", "<s:ky>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:5>", "2.3000000000000003"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[2.3000000000000003,2.3000000000000003] {getCentralValue=2.3000000000000003, getLength=0.0, getLowerBound=2.3000000000000003, getUpperBound=2.3000000000000003}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:7>", "-20"}, true), new String[][]{{"isSelected", "java.lang.Comparable", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "java.util.List", "boolean"}, new String[]{"<sample:0>", "<empty>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateToFindRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "java.util.List", "org.jfree.data.Range", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:9>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<null>", "<i:120>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:8>", "-2147483593"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:6>", "-38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"0xFFFFFFFF", "1.2I", "<sample:0>"}, true), new String[][]{{"removeColumn", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:7>", "<s:keyq>"}, true), new String[][]{{"fireSelectionEvent", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<s:bwB>"}, true), new String[][]{{"getKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"0x123456789", "", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:6>", "<i:-1>", "46.0"}, true), new String[][]{{"insertValue", "int,java.lang.Comparable,java.lang.Number", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:9>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[Infinity,Infinity] {getCentralValue=Infinity, getLength=NaN, getLowerBound=Infinity, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:4>", "-28"}, true), new String[][]{{"getGroup", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{".c0.0", "PTT1H", "<sample:1>"}, true), new String[][]{{"setSelected", "int,int,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<null>", "<b:false>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:1>", "55"}, true), new String[][]{{"getGroup", "", "7"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<i:-48>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-1.0,-1.0] {getCentralValue=-1.0, getLength=0.0, getLowerBound=-1.0, getUpperBound=-1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:2>", "59"}, true), new String[][]{{"sortByKeys", "org.jfree.chart.util.SortOrder", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<null>", "-1.0000000000000004"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:4>", "33554446"}, true), new String[][]{{"getItemCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:5>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:6>", "-1073741824"}, true), new String[][]{{"insertValue", "int,java.lang.Comparable,java.lang.Number", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:3>", "33554442"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:5>"}, true), new String[][]{{"intersects", "org.jfree.data.Range", "6"}, {"constrain", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "org.jfree.data.KeyToGroupMap"}, new String[]{"<sample:4>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:2>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "isEmptyOrNull", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:2>", "<null>"}, true), new String[][]{{"getValue", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:0>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateCategoryRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "boolean"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:2>", "<s:bT>", "0.0", "2147483647"}, true), new String[][]{{"getGroup", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:5>", "33554404"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.0,1.0] {getCentralValue=1.0, getLength=0.0, getLowerBound=1.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-3.0,0.0] {getCentralValue=-1.5, getLength=3.0, getLowerBound=-3.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:3>", "7.999999999999999"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[7.999999999999999,7.999999999999999] {getCentralValue=7.999999999999999, getLength=0.0, getLowerBound=7.999999999999999, getUpperBound=7.999999999999999}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true), new String[][]{{"intersects", "double,double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-Infinity,-Infinity] {getCentralValue=-Infinity, getLength=NaN, getLowerBound=-Infinity, getUpperBound=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:9>", "true"}, true), new String[][]{{"getLowerBound", "", "0"}, {"getLowerBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"null", "1D-5", "<sample:4>"}, true), new String[][]{{"getRowKeys", "", "5"}, {"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double"}, new String[]{"<sample:5>", "<sample:0>", "5.0"}, true), new String[][]{{"getIndex", "java.lang.Comparable", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "true"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true), new String[][]{{"getUpperBound", "", "2"}, {"intersects", "org.jfree.data.Range", "4"}, {"constrain", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:3>", "true"}, true), new String[][]{{"intersects", "double,double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"acc", "", "<sample:2>"}, true), new String[][]{{"incrementValue", "double,java.lang.Comparable,java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:0>"}, true), new String[][]{{"getCentralValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "sampleFunction2DToSeries", new String[]{"org.jfree.data.function.Function2D", "double", "double", "int", "java.lang.Comparable"}, new String[]{"<sample:5>", "-46.0", "8.0", "105", "<sample:1>"}, true), new String[][]{{"getAllowDuplicateXValues", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset"}, new String[]{"<sample:7>"}, true), new String[][]{{"getCentralValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "false"}, true), new String[][]{{"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:5>", "8.000000000000002"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[8.000000000000002,8.000000000000002] {getCentralValue=8.000000000000002, getLength=0.0, getLowerBound=8.000000000000002, getUpperBound=8.000000000000002}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:3>"}, true), new String[][]{{"getLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset"}, new String[]{"<sample:6>"}, true), new String[][]{{"getUpperBound", "", "0"}, {"intersects", "double,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateDomainBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findDomainBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:5>", "true"}, true), new String[][]{{"getLowerBound", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "double[][]"}, new String[]{"-.5", "-1I", "<sample:2>"}, true), new String[][]{{"clone", "", "5"}, {"getRowIndex", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:0>", "Infinity"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[Infinity,Infinity] {getCentralValue=Infinity, getLength=NaN, getLowerBound=Infinity, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMaximumRangeValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true), new String[][]{{"intersects", "double,double", "1"}, {"constrain", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:3>", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[1.7976931348623157E308,1.7976931348623157E308] {getCentralValue=1.7976931348623157E308, getLength=0.0, getLowerBound=1.7976931348623157E308, getUpperBound=1.7976931348623157E308}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateRangeBounds", new String[]{"org.jfree.data.xy.XYDataset", "boolean"}, new String[]{"<sample:7>", "false"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:7>"}, true), new String[][]{{"constrain", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "iterateXYRangeBounds", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true), new String[][]{{"getLowerBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForRow", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:7>", "<s:{T>"}, true), new String[][]{{"setValue", "java.lang.Comparable,java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "calculateStackTotal", new String[]{"org.jfree.data.xy.TableXYDataset", "int"}, new String[]{"<sample:5>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.String", "java.lang.String", "java.lang.Number[][]"}, new String[]{"Null 'rowData'argument.", "Null 'rowKey' argument.", "<sample:2>"}, true), new String[][]{{"getRowCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findMinimumDomainValue", new String[]{"org.jfree.data.xy.XYDataset"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "int"}, new String[]{"<sample:7>", "10"}, true), new String[][]{{"getSelectionState", "", "6"}, {"getKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.category.CategoryDataset", "double"}, new String[]{"<sample:3>", "10.0"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[10.0,10.0] {getCentralValue=10.0, getLength=0.0, getLowerBound=10.0, getUpperBound=10.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<s:key>", "<sample:2>"}, true), new String[][]{{"removeValue", "java.lang.Comparable,java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createPieDatasetForColumn", new String[]{"org.jfree.data.category.CategoryDataset", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:kNek>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.pie.DefaultPieDataset", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createConsolidatedPieDataset", new String[]{"org.jfree.data.pie.PieDataset", "java.lang.Comparable", "double", "int"}, new String[]{"<sample:5>", "<s:>", "4.2", "16"}, true, 0, null, 1), new String[][]{{"setSelected", "java.lang.Comparable,boolean,boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "findStackedRangeBounds", new String[]{"org.jfree.data.xy.TableXYDataset", "double"}, new String[]{"<sample:6>", "-4.9E-324"}, true);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[-3.0,-4.9E-324] {getCentralValue=-1.5, getLength=3.0, getLowerBound=-3.0, getUpperBound=-4.9E-324}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.general.DatasetUtilities", "org.jfree.data.general.DatasetUtilities", "createCategoryDataset", new String[]{"java.lang.Comparable", "org.jfree.data.KeyedValues"}, new String[]{"<i:0>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getRowKey", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
