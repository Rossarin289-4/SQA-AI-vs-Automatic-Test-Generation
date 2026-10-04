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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", new String[]{"double"}, new String[]{"NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,0.0},{0.0,NaN}} {getColumnDimension=2, getData=[[NaN, 0.0], [0.0, NaN]], getDataRef=[[NaN, 0.0], [0.0, NaN]], getDeterminant=0.0, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#255#-1050525815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setEntry", "int,int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, 0.0], [0.0, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"isSquare", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,0.0},{0.0,NaN}} {getColumnDimension=2, getData=[[NaN, 0.0], [0.0, NaN]], getDataRef=[[NaN, 0.0], [0.0, NaN]], getDeterminant=0.0, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#255#-1050525815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}), new String[][]{{"getFrobeniusNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 2), new String[][]{{"getRow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", new String[]{"double"}, new String[]{"-1.0"}, false, 5, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,0.0},{0.0,NaN}} {getColumnDimension=2, getData=[[NaN, 0.0], [0.0, NaN]], getDataRef=[[NaN, 0.0], [0.0, NaN]], getDeterminant=0.0, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#255#-1050525815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "5"}, {"addToEntry", "int,int,double", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", ""}}), new String[][]{{"setRow", "int,double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,0.0},{0.0,NaN}} {getColumnDimension=2, getData=[[NaN, 0.0], [0.0, NaN]], getDataRef=[[NaN, 0.0], [0.0, NaN]], getDeterminant=0.0, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#255#-1050525815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "1.0"}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "1.0"}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}), new String[][]{{"inverse", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{NaN,0.0},{0.0,NaN}} {getColumnDimension=2, getData=[[NaN, 0.0], [0.0, NaN]], getDataRef=[[NaN, 0.0], [0.0, NaN]], getDeterminant=0.0, getFrobeniusNorm=NaN, getNorm=NaN, getRowDim...#255#-1050525815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "-1.0000000000000002"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 3), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"setColumn", "int,double[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getVT", ""}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getNorm", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 1), new String[][]{{"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "0.0"}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "21.0"}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", ""}}, 1), new String[][]{{"isSquare", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 1), new String[][]{{"setEntry", "int,int,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}}, 3), new String[][]{{"getColumnDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}, {"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getRank", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", ""}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getConditionNumber", ""}}, 1), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getCovariance", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSolver", ""}}, 2), new String[][]{{"inverse", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", ""}}, 3), new String[][]{{"inverse", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.SingularMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getV", ""}}, 1), new String[][]{{"getData", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, 0.0], [0.0, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getUT", ""}}, 3), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.SingularValueDecompositionImpl", "getSingularValues", ""}}, 3), new String[][]{{"preMultiply", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getConditionNumber=NaN, getNorm=NaN, getRank=0, getSingularValues=[NaN, NaN]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.SingularValueDecompositionImpl", "org.apache.commons.math.linear.SingularValueDecompositionImpl", "getU", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
