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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN,-1.0}} {getColumnDimension=2, getData=[[NaN, -1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=!NonSquareMatrixExcep...#259#-37426057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!ArrayIndexOutOfBoundsException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 3), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false), new String[][]{{"getInverse", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getInverse", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{NaN}} {getColumnDimension=1, getData=[[NaN]], getDataRef=[[NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=NaN, isSingular=false, isSquare=tru...#202#-631455679", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"solve", "org.apache.commons.math.linear.RealVector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"isNonSingular", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}), new String[][]{{"solve", "double[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 2), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false), new String[][]{{"solve", "org.apache.commons.math.linear.RealVector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!ArrayIndexOutOfBoundsException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 3), new String[][]{{"getInverse", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getInverse", "", "5"}, {"luDecompose", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{NaN}} {getColumnDimension=1, getData=[[NaN]], getDataRef=[[NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=NaN, isSingular=false, isSquare=tru...#202#-631455679", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!ArrayIndexOutOfBoundsException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN},{-1.0}} {getColumnDimension=1, getData=[[NaN], [-1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixE...#263#-87799937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN},{-1.0}} {getColumnDimension=1, getData=[[NaN], [-1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixE...#263#-87799937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN,-1.0}} {getColumnDimension=2, getData=[[NaN, -1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=!NonSquareMatrixExcep...#259#-37426057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"solve", "double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"getInverse", "", "5"}, {"copySubMatrix", "int[],int[],double[][]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 2), new String[][]{{"getInverse", "", "5"}, {"copySubMatrix", "int[],int[],double[][]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 3), new String[][]{{"getInverse", "", "5"}, {"copySubMatrix", "int[],int[],double[][]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 3), new String[][]{{"isNonSingular", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!ArrayIndexOutOfBoundsException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 1), new String[][]{{"isNonSingular", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 1), new String[][]{{"getInverse", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1), new String[][]{{"getInverse", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{NaN}} {getColumnDimension=1, getData=[[NaN]], getDataRef=[[NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=NaN, isSingular=false, isSquare=tru...#202#-631455679", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 2), new String[][]{{"getInverse", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{NaN}} {getColumnDimension=1, getData=[[NaN]], getDataRef=[[NaN]], getDeterminant=NaN, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=NaN, isSingular=false, isSquare=tru...#202#-631455679", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2), new String[][]{{"solve", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"solve", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"solve", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3), new String[][]{{"solve", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2), new String[][]{{"getInverse", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=!ArrayIndexOutOfBoundsException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}), new String[][]{{"getInverse", "", "2"}, {"scalarMultiply", "double", "1"}, {"getFrobeniusNorm", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}), new String[][]{{"getInverse", "", "2"}, {"scalarMultiply", "double", "1"}, {"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2), new String[][]{{"isNonSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 3), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "3"}, {"copy", "", "7"}, {"getDataRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}), new String[][]{{"solve", "org.apache.commons.math.linear.RealVector", "3"}, {"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1), new String[][]{{"solve", "org.apache.commons.math.linear.RealVector", "3"}, {"mapCos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "3"}, {"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3), new String[][]{{"solve", "org.apache.commons.math.linear.RealVectorImpl", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"solve", "org.apache.commons.math.linear.RealVectorImpl", "2"}, {"mapAbs", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 2), new String[][]{{"solve", "org.apache.commons.math.linear.RealVectorImpl", "2"}, {"append", "org.apache.commons.math.linear.RealVectorImpl", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN); 1; (Infinity)} {getData=[NaN, 1.0, Infinity], getDataRef=[NaN, 1.0, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}), new String[][]{{"solve", "org.apache.commons.math.linear.RealVectorImpl", "2"}, {"append", "org.apache.commons.math.linear.RealVectorImpl", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN); 1; (Infinity)} {getData=[NaN, 1.0, Infinity], getDataRef=[NaN, 1.0, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 62, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN,-1.0}} {getColumnDimension=2, getData=[[NaN, -1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=1, getTrace=!NonSquareMatrixExcep...#259#-37426057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2), new String[][]{{"getRow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"getRow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN},{-1.0}} {getColumnDimension=1, getData=[[NaN], [-1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixE...#263#-87799937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealVector", "6"}, {"mapAbs", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN); (Infinity)} {getData=[NaN, Infinity], getDataRef=[NaN, Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealVector", "6"}, {"mapAbs", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealVectorImpl", actual.getClass().getName());
  assertEquals("{(NaN); (Infinity)} {getData=[NaN, Infinity], getDataRef=[NaN, Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"getColumnDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"getColumn", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"setEntry", "int,int,double", "2"}, {"getDeterminant", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "2"}, {"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "6"}, {"getDeterminant", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 3), new String[][]{{"isSingular", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"scalarAdd", "double", "4"}, {"preMultiply", "org.apache.commons.math.linear.RealMatrix", "4"}, {"getData", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0, 0.0, 1.0], [0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}), new String[][]{{"getColumnMatrix", "int", "3"}, {"isSquare", "", "2"}, {"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getColumnDimension", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}), new String[][]{{"isSquare", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1), new String[][]{{"createMatrix", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimen...#297#1344452919", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 3), new String[][]{{"getColumnVector", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"transpose", "", "1"}, {"operate", "double[]", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 3), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.DenseRealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.DenseRealMatrix", actual.getClass().getName());
  assertEquals("DenseRealMatrix{{NaN},{-1.0}} {getColumnDimension=1, getData=[[NaN], [-1.0]], getDeterminant=!NonSquareMatrixException, getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixE...#263#-87799937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 3), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}, {"solve", "org.apache.commons.math.linear.RealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 1), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "2"}, {"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1), new String[][]{{"isSingular", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 62, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 3), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}), new String[][]{{"getRowDimension", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 1), new String[][]{{"getNorm", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "3"}, {"getRowVector", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"isSquare", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 62, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2), new String[][]{{"isSingular", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", ""}}, 2), new String[][]{{"isSquare", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getFrobeniusNorm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getSolver", ""}}, 1), new String[][]{{"copy", "", "4"}, {"getRow", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1), new String[][]{{"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "2"}, {"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"copy", "", "1"}, {"getData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 3), new String[][]{{"operate", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 2), new String[][]{{"createMatrix", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getL", ""}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.CholeskyDecompositionImpl", "org.apache.commons.math.linear.CholeskyDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 62, new String[][]{{"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}, {"org.apache.commons.math.linear.CholeskyDecompositionImpl", "getLT", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
}
