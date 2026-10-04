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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"1039138815"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"-2147483648"}, false, 10, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "9"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"1610612736"}, false, 11, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "9"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "54"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "1610612736"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"getInverse", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDataRef=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquar...#207#-777239274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "1610612736"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "-2147483648"}}, 2), new String[][]{{"getInverse", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDataRef=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquar...#207#-777239274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"getInverse", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDataRef=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquar...#207#-777239274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"getInverse", "", "2"}, {"getDeterminant", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"isNonSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "9"}}, 3), new String[][]{{"getInverse", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDataRef=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquar...#207#-777239274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "9"}}), new String[][]{{"getInverse", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "9"}}), new String[][]{{"isNonSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "9"}}, 3), new String[][]{{"getInverse", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"getInverse", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1), new String[][]{{"getInverse", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"solve", "double[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"solve", "double[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"solve", "org.apache.commons.math.linear.RealVector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.EigenDecompositionImpl$Solver", actual.getClass().getName());
  assertEquals("{isNonSingular=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1), new String[][]{{"isNonSingular", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "-1"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"isNonSingular", "", "1"}, {"solve", "org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "27"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1), new String[][]{{"isNonSingular", "", "1"}, {"isNonSingular", "", "6"}, {"solve", "org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "-1"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"5"}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "10"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "1"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSqua...#208#163812952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"10"}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"50"}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"-2147483648"}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"3"}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", new String[]{"int"}, new String[]{"-4195390"}, false, 15, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSqua...#208#163812952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "1"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "8"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}}, 3), new String[][]{{"getData", "", "1"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "28"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 2), new String[][]{{"getRowVector", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 1), new String[][]{{"getRowVector", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "1073739775"}}), new String[][]{{"getDeterminant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}), new String[][]{{"isSquare", "", "2"}, {"isSingular", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", new String[]{"int"}, new String[]{"55"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "1"}}, 2), new String[][]{{"preMultiply", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "53"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"multiplyEntry", "int,int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "28"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSqua...#208#163812952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getFrobeniusNorm=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSqua...#208#163812952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{-Infinity}} {getColumnDimension=1, getData=[[-Infinity]], getDataRef=[[-Infinity]], getDeterminant=-Infinity, getFrobeniusNorm=Infinity, getNorm=Infinity, getRowDimension=1, getT...#248#-946673328", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "2"}}), new String[][]{{"getColumn", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "2"}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"getInverse", "", "2"}, {"getDeterminant", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"getInverse", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDataRef=[[0.0]], getDeterminant=0.0, getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquar...#207#-777239274", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}, 2), new String[][]{{"getInverse", "", "2"}, {"getRowVector", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getVT", ""}}), new String[][]{{"getInverse", "", "6"}, {"getRowVector", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "28"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getSolver", ""}}, 3), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "3"}, {"addToEntry", "int,int,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"multiplyEntry", "int,int,double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{-Infinity}} {getColumnDimension=1, getData=[[-Infinity]], getDataRef=[[-Infinity]], getDeterminant=-Infinity, getFrobeniusNorm=Infinity, getNorm=Infinity, getRowDimension=1, getT...#248#-946673328", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "-2147483648"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "2147483647"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"53"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "-2147483609"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "0"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "-1"}}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "2"}, {"scalarMultiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getD", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", "int", "-1"}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getImagEigenvalue", "int", "2147483647"}}, 2), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "2"}, {"scalarMultiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getDeterminant=-Infinity, getImagEigenvalues=[0.0], getRealEigenvalues=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getEigenvector", new String[]{"int"}, new String[]{"27"}, false, 0, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getV", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getDeterminant", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.EigenDecompositionImpl", "org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalues", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.EigenDecompositionImpl", "getD", ""}, {"org.apache.commons.math.linear.EigenDecompositionImpl", "getRealEigenvalue", "int", "26"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDeterminant=0.0, getImagEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getRealEigenvalues=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
}
