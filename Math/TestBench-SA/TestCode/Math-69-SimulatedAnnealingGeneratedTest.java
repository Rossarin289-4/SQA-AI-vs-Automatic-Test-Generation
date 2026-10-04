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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{NaN,NaN},{NaN,NaN}} {getColumnDimension=2, getData=[[NaN, NaN], [NaN, NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=NaN, isSingular=false, ...#214#246580401", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN},{NaN,0.0,NaN,NaN},{NaN,NaN,0.0,NaN},{NaN,NaN,NaN,0.0}} {getColumnDimension=4, getData=[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0,.., getDeterminant=0...#303#1545092724", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN,NaN},{NaN,0.0,NaN,NaN,NaN},{NaN,NaN,0.0,NaN,NaN},{NaN,NaN,NaN,0.0,NaN},{NaN,NaN,NaN,NaN,0.0}} {getColumnDimension=5, getData=[[0.0, NaN, NaN, NaN, NaN], [NaN, 0.0, NaN...#341#-692782217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"getColumn", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN,NaN,NaN,NaN},{NaN,0.0,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,0.0,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,0.0,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,0.0,NaN,NaN},{NaN,NaN,NaN,NaN,NaN,0.0,NaN},{NaN...#441#-2012834779", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}), new String[][]{{"getData", "", "1"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, NaN, NaN, NaN, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN, NaN, NaN, NaN], [NaN, NaN, 0.0, NaN, NaN, NaN, NaN], [NaN, NaN, NaN, 0.0, NaN, NaN, NaN], [NaN, NaN, NaN, NaN, 0.0, NaN, NaN], [NaN, NaN, NaN...#259#-819958660", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}), new String[][]{{"getFrobeniusNorm", "", "1"}, {"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}, 3), new String[][]{{"getFrobeniusNorm", "", "1"}, {"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:8>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 1), new String[][]{{"getFrobeniusNorm", "", "1"}, {"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:11>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN,NaN},{NaN,1.0,NaN,NaN},{NaN,NaN,1.0,NaN},{NaN,NaN,NaN,1.0}} {getColumnDimension=4, getData=[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0,.., getDeterminant=N...#304#-1981608537", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:10>"}, false), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN, NaN, NaN, NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN,NaN},{NaN,1.0,NaN,NaN},{NaN,NaN,1.0,NaN},{NaN,NaN,NaN,1.0}} {getColumnDimension=4, getData=[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0,.., getDeterminant=N...#304#-1981608537", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN},{NaN,1.0,NaN},{NaN,NaN,1.0}} {getColumnDimension=3, getData=[[1.0, NaN, NaN], [NaN, 1.0, NaN], [NaN, NaN, 1.0]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, ge...#263#-375377589", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 8, new String[][]{}, 2), new String[][]{{"subtract", "org.apache.commons.math.linear.BlockRealMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<empty>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"subtract", "org.apache.commons.math.linear.BlockRealMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"addToEntry", "int,int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}), new String[][]{{"addToEntry", "int,int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN,NaN,NaN},{NaN,1.0,NaN,NaN,NaN},{NaN,NaN,1.0,NaN,NaN},{NaN,NaN,NaN,1.0,NaN},{NaN,NaN,NaN,NaN,1.0}} {getColumnDimension=5, getData=[[1.0, NaN, NaN, NaN, NaN], [NaN, 1.0, NaN...#342#-26296571", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 3), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,1.0},{1.0,1.0}} {getColumnDimension=2, getData=[[1.0, 1.0], [1.0, 1.0]], getDeterminant=0.0, getFrobeniusNorm=2.0, getNorm=2.0, getRowDimension=2, getTrace=2.0, isSingular=true, i...#213#-1242149814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"scalarMultiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{-1.0,NaN,NaN,NaN,NaN,NaN,NaN},{NaN,-1.0,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,-1.0,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,-1.0,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,-1.0,NaN,NaN},{NaN,NaN,NaN,NaN,NaN,-1.0,NaN...#450#-295399007", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}), new String[][]{{"setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<empty>"}}, 3), new String[][]{{"setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<empty>"}}, 3), new String[][]{{"transpose", "", "3"}, {"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:2>"}}), new String[][]{{"transpose", "", "3"}, {"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"transpose", "", "3"}, {"getColumnMatrix", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.9999999999999998},{0.9999999999999998},{0.9999999999999998},{1.0},{0.9999999999999998},{0.9999999999999998},{0.9999999999999998}} {getColumnDimension=1, getData=[[0.9999999999999998...#458#1200992266", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}, 1), new String[][]{{"transpose", "", "3"}, {"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:1>"}}), new String[][]{{"getRowVector", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN); 1; (NaN)} {getData=[NaN, NaN, NaN, 1.0, NaN], getDataRef=[NaN, NaN, NaN, 1.0, NaN], getDimension=5, getL1Norm=NaN, getLInfNorm=NaN, getMaxIndex=3, getMaxValue=1.0, getMinIndex=3,...#260#-8863772", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<empty>"}}), new String[][]{{"getColumn", "int", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN, NaN, 1.0, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1), new String[][]{{"addToEntry", "int,int,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false), new String[][]{{"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0, NaN], [NaN, NaN, NaN, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}), new String[][]{{"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0...#259#769534387", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 3), new String[][]{{"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, 1.0], [1.0, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 3), new String[][]{{"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3), new String[][]{{"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0, NaN], [NaN, NaN, NaN, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}), new String[][]{{"setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:3>"}}), new String[][]{{"setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:3>"}}, 1), new String[][]{{"setSubMatrix", "double[][],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "2"}, {"preMultiply", "org.apache.commons.math.linear.RealVector", "7"}, {"mapAsin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 0; 0} {getData=[0.0, 0.0, 0.0, 0.0], getDataRef=[0.0, 0.0, 0.0, 0.0], getDimension=4, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=3, getMaxValue=0.0, getMinIndex=3, getMinValue=0.0, getNorm=0.0...#232#-79526329", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"scalarAdd", "double", "6"}, {"isSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"scalarAdd", "double", "6"}, {"getTrace", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"scalarAdd", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN},{NaN,0.0,NaN,NaN},{NaN,NaN,0.0,NaN},{NaN,NaN,NaN,0.0}} {getColumnDimension=4, getData=[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0,.., getDeterminant=0...#303#1545092724", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}, {"copySubMatrix", "int[],int[],double[][]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 2), new String[][]{{"setRowVector", "int,org.apache.commons.math.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:2>"}}, 3), new String[][]{{"getEntry", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:10>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,1.0,1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0,1.0,1.0,1.0},{1.0...#441#-1944369266", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3), new String[][]{{"copy", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{1.0,NaN,NaN,NaN},{NaN,1.0,NaN,NaN},{NaN,NaN,1.0,NaN},{NaN,NaN,NaN,1.0}} {getColumnDimension=4, getData=[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0,.., getDeterminant=N...#304#-1981608537", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 1), new String[][]{{"copy", "", "0"}, {"getColumn", "int", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, 1.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:7>"}}, 1), new String[][]{{"copy", "", "0"}, {"getDeterminant", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 1), new String[][]{{"copy", "", "0"}, {"getDeterminant", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3), new String[][]{{"copy", "", "0"}, {"getDeterminant", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN},{NaN,0.0,NaN,NaN},{NaN,NaN,0.0,NaN},{NaN,NaN,NaN,0.0}} {getColumnDimension=4, getData=[[0.0, NaN, NaN, NaN], [NaN, 0.0, NaN, NaN], [NaN, NaN, 0.0,.., getDeterminant=0...#303#1545092724", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN,NaN},{NaN,0.0,NaN,NaN,NaN},{NaN,NaN,0.0,NaN,NaN},{NaN,NaN,NaN,0.0,NaN},{NaN,NaN,NaN,NaN,0.0}} {getColumnDimension=5, getData=[[0.0, NaN, NaN, NaN, NaN], [NaN, 0.0, NaN...#341#-692782217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2), new String[][]{{"getColumn", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"getSubMatrix", "int[],int[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN...#260784#-616991559", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}), new String[][]{{"getDeterminant", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 1), new String[][]{{"getDeterminant", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 2), new String[][]{{"getDeterminant", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2), new String[][]{{"getTrace", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2), new String[][]{{"getColumnDimension", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN, NaN], [NaN, 1.0, NaN, NaN], [NaN, NaN, 1.0, NaN], [NaN, NaN, NaN, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 3), new String[][]{{"getNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<empty>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 3), new String[][]{{"getNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.999999999999999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", new String[]{"double[][]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getDeterminant", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getDeterminant", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<empty>", "<sample:2>"}}, 2), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 3), new String[][]{{"createMatrix", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=5, getData=[[0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0], [0.0,.., ...#385#-1081728503", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2), new String[][]{{"createMatrix", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<empty>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 3), new String[][]{{"inverse", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<sample:1>"}}, 2), new String[][]{{"isSquare", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<null>", "<empty>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}, 1), new String[][]{{"getColumnDimension", "", "2"}, {"getRowDimension", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 3), new String[][]{{"multiplyEntry", "int,int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}), new String[][]{{"getRow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}, 1), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "0"}, {"inverse", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:2>", "<sample:1>"}}, 1), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,NaN},{NaN,NaN}} {getColumnDimension=2, getData=[[NaN, NaN], [NaN, NaN]], getDataRef=[[NaN, NaN], [NaN, NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#256#-751806823", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 1), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "5"}, {"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}, {"getRow", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.BlockRealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<null>", "<sample:2>"}}, 1), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.BlockRealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"isSquare", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"isSquare", "", "2"}, {"getColumnDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "1"}, {"getNorm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}), new String[][]{{"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}, 3), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN], [NaN, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"setColumn", "int,double[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 14, new String[][]{}, 2), new String[][]{{"getRow", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:13>"}, false, 14, new String[][]{}, 2), new String[][]{{"getRow", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}, {"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<empty>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}, {"inverse", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}, {"inverse", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,NaN},{NaN,NaN}} {getColumnDimension=2, getData=[[NaN, NaN], [NaN, NaN]], getDataRef=[[NaN, NaN], [NaN, NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#256#-751806823", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN},{NaN,0.0,NaN,NaN,NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,0.0,NaN,NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,0.0,NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN...#653#-1361673930", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:1>", "<empty>"}}, 3), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}, 3), new String[][]{{"getRow", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN, 0.0, NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 3), new String[][]{{"setRow", "int,double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 3), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", "double[],double[]", "<sample:3>", "<sample:0>"}}, 1), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}, 1), new String[][]{{"isSingular", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}, 1), new String[][]{{"isSquare", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}}), new String[][]{{"setColumn", "int,double[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<null>"}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<null>"}}, 2), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}}, 2), new String[][]{{"getDeterminant", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}, 2), new String[][]{{"getFrobeniusNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}), new String[][]{{"getRowDimension", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlation", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "covarianceToCorrelation", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:1>"}}, 3), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationMatrix", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}, 2), new String[][]{{"scalarAdd", "double", "2"}, {"getColumn", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[9.424321830774484E-9, 9.424321830774484E-9, 9.424321830774484E-9, 0.0, 9.424321830774484E-9, 9.424321830774484E-9, 9.424321830774484E-9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationStandardErrors", ""}}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}}, 1), new String[][]{{"copy", "", "4"}, {"inverse", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 3), new String[][]{{"getDeterminant", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.correlation.PearsonsCorrelation", "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "getCorrelationPValues", ""}, {"org.apache.commons.math.stat.correlation.PearsonsCorrelation", "computeCorrelationMatrix", "double[][]", "<sample:2>"}}, 3), new String[][]{{"getDeterminant", "", "1"}, {"inverse", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
}
