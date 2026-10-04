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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN,NaN},{NaN,1.0,NaN,NaN},{NaN,NaN,1.0,NaN},{NaN,NaN,NaN,1.0}} {getColumnDimension=4, getData=[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0,.., getDeterminant=N...#304#-1981608537", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}), new String[][]{{"multiply", "org.apache.commons.math.linear.RealMatrix", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN}} {getColumnDimension=4, getData=[[NaN, NaN, NaN, NaN], [NaN, NaN, NaN, NaN], [NaN, NaN, NaN,.., getDeterminant=N...#304#233574852", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{NaN,NaN},{NaN,NaN}} {getColumnDimension=2, getData=[[NaN, NaN], [NaN, NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=NaN, isSingular=false, ...#214#246580401", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN},{NaN,0.0,NaN,NaN},{NaN,NaN,0.0,NaN},{NaN,NaN,NaN,0.0}} {getColumnDimension=4, getData=[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0,.., getDeterminant=0...#303#1545092724", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"setColumn", "int,double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"getEntry", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"addToEntry", "int,int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getFrobeniusNorm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}), new String[][]{{"getColumnVector", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); 0; (NaN); (NaN)} {getData=[NaN, 0.0, NaN, NaN], getDataRef=[NaN, 0.0, NaN, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=1, getMaxValue=0.0, getMinIndex=1, getMinValue=0.0,...#243#-1403029353", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.BlockRealMatrix", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}), new String[][]{{"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "3"}, {"getFrobeniusNorm", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false), new String[][]{{"getEntry", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}, {"createMatrix", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}), new String[][]{{"getData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:2>"}}), new String[][]{{"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}), new String[][]{{"setColumn", "int,double[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}), new String[][]{{"getColumn", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:5>"}}), new String[][]{{"getColumnDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getNorm", "", "5"}, {"isSquare", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:1>"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0, NaN], [NaN, NaN, NaN, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}), new String[][]{{"getRowDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 2), new String[][]{{"getTrace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}), new String[][]{{"getNorm", "", "5"}, {"getRowVector", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (NaN); (NaN); (NaN)} {getData=[1.0, NaN, NaN, NaN], getDataRef=[1.0, NaN, NaN, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=0, getMaxValue=1.0, getMinIndex=0, getMinValue=1.0,...#243#-1086362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"createMatrix", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}), new String[][]{{"solve", "double[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN},{NaN,1.0}} {getColumnDimension=2, getData=[[1.0, NaN], [NaN, 1.0]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=2.0, isSingular=false, ...#214#-46153286", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}), new String[][]{{"getColumnDimension", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN},{NaN,0.0,NaN,NaN},{NaN,NaN,0.0,NaN},{NaN,NaN,NaN,0.0}} {getColumnDimension=4, getData=[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0,.., getDeterminant=0...#303#1545092724", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:3>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.BlockRealMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"add", "org.apache.commons.math.linear.BlockRealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isSingular", "", "5"}, {"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 2), new String[][]{{"getColumnDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}), new String[][]{{"preMultiply", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getColumnDimension", "", "1"}, {"addToEntry", "int,int,double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN},{NaN,0.0,NaN,NaN},{NaN,NaN,0.0,NaN},{NaN,NaN,NaN,0.0}} {getColumnDimension=4, getData=[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0,.., getDeterminant=0...#303#1545092724", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<null>", "<sample:3>"}}, 3), new String[][]{{"addToEntry", "int,int,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"getColumnDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 1), new String[][]{{"getColumnMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}}, 1), new String[][]{{"inverse", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getRowDimension", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 3), new String[][]{{"inverse", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN}} {getColumnDimension=4, getData=[[NaN, NaN, NaN, NaN], [NaN, NaN, NaN, NaN], [NaN, NaN, NaN,.., getDataRef=...#384#-1262849019", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getRowVector", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "7"}, {"getColumnDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"setRowVector", "int,org.apache.commons.math.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}), new String[][]{{"getData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 1), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3), new String[][]{{"getRowDimension", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:8>"}}, 2), new String[][]{{"getRowVector", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"isSingular", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"isSingular", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2), new String[][]{{"getTrace", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2), new String[][]{{"copy", "", "1"}, {"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 1), new String[][]{{"getRowMatrix", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "2"}, {"preMultiply", "org.apache.commons.math.linear.RealVector", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}, 1), new String[][]{{"addToEntry", "int,int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 1), new String[][]{{"multiply", "org.apache.commons.math.linear.BlockRealMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 1), new String[][]{{"getTrace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2), new String[][]{{"inverse", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN}} {getColumnDimension=4, getData=[[NaN, NaN, NaN, NaN], [NaN, NaN, NaN, NaN], [NaN, NaN, NaN,.., getDataRef=...#384#-1262849019", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2), new String[][]{{"multiplyEntry", "int,int,double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN,NaN},{NaN,0.0,NaN,NaN,NaN},{NaN,NaN,0.0,NaN,NaN},{NaN,NaN,NaN,0.0,NaN},{NaN,NaN,NaN,NaN,0.0}} {getColumnDimension=5, getData=[[0.0, NaN, NaN, NaN, NaN], [NaN, 0.0, NaN...#341#-692782217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"addToEntry", "int,int,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN,NaN},{NaN,1.0,NaN,NaN},{NaN,NaN,1.0,NaN},{NaN,NaN,NaN,1.0}} {getColumnDimension=4, getData=[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0,.., getDeterminant=N...#304#-1981608537", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"isSquare", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3), new String[][]{{"inverse", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN}} {getColumnDimension=5, getData=[[NaN, NaN, NaN, NaN, NaN], [NaN, NaN...#422#1428139454", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 2), new String[][]{{"getDeterminant", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0}} {getColumnDimension=5, getData=[[1.0, 1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0...#341#-685022089", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<null>", "<sample:2>"}}, 2), new String[][]{{"getRowVector", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3), new String[][]{{"isSquare", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<null>"}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,1.0},{1.0,1.0}} {getColumnDimension=2, getData=[[1.0, 1.0], [1.0, 1.0]], getDeterminant=0.0, getFrobeniusNorm=2.0, getNorm=2.0, getRowDimension=2, getTrace=2.0, isSingular=true, i...#213#-1242149814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3), new String[][]{{"inverse", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,NaN,NaN},{NaN,NaN,NaN},{NaN,NaN,NaN}} {getColumnDimension=3, getData=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getDataRef=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, ...#332#348012824", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"isSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3), new String[][]{{"getRowVector", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3), new String[][]{{"copy", "", "2"}, {"inverse", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 1), new String[][]{{"getRowVector", "int", "5"}, {"append", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 1; (Infinity)} {getData=[NaN, NaN, 1.0, Infinity], getDataRef=[NaN, NaN, 1.0, Infinity], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=3, getMaxValue=Infinity, getMinIndex...#263#484380753", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:9>"}, false, 0, null, 3), new String[][]{{"getColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 1.0, NaN, NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,1.0},{1.0,1.0}} {getColumnDimension=2, getData=[[1.0, 1.0], [1.0, 1.0]], getDeterminant=0.0, getFrobeniusNorm=2.0, getNorm=2.0, getRowDimension=2, getTrace=2.0, isSingular=true, i...#213#-1242149814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<null>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<null>", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3), new String[][]{{"getNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 2), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN], [NaN, 1.0, NaN], [NaN, NaN, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2), new String[][]{{"isSingular", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"isSingular", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, NaN, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN, NaN], [NaN, NaN, 0.0, NaN, NaN], [NaN, NaN, NaN, 0.0, NaN], [NaN, NaN, NaN, NaN, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 2), new String[][]{{"getRowVector", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1), new String[][]{{"isSingular", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:1>"}}, 2), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "1"}, {"getColumnVector", "int", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:4>"}}, 3), new String[][]{{"createMatrix", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"getColumnDimension", "", "2"}, {"isSquare", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 3), new String[][]{{"isSingular", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 3), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}, {"getColumnDimension", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 1), new String[][]{{"isSquare", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}, 2), new String[][]{{"setRowVector", "int,org.apache.commons.math.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"getRowDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"setColumn", "int,double[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getTrace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:9>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}, 1), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}}, 3), new String[][]{{"getRowVector", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 3), new String[][]{{"getColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0, NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getColumnDimension", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 1), new String[][]{{"preMultiply", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:4>", "<null>"}}, 1), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"isSingular", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"getColumn", "int", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN, NaN, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 3), new String[][]{{"setColumn", "int,double[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 1), new String[][]{{"isSquare", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 3), new String[][]{{"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:9>"}}, 2), new String[][]{{"getColumnDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:3>"}}, 1), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:9>"}}, 1), new String[][]{{"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0, NaN], [NaN, NaN, NaN, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}, 1), new String[][]{{"getDeterminant", "", "4"}, {"operate", "org.apache.commons.math.linear.RealVector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN); (NaN)} {getData=[NaN, NaN, NaN, NaN], getDataRef=[NaN, NaN, NaN, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValu...#249#-879161791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"luDecompose", "", "4"}, {"getColumnDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
}
