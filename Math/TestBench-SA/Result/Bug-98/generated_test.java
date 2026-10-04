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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<empty>", "1", "-2147483648"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}), new String[][]{{"preMultiply", "double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "-33"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "8388508"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "-1", "27", "-2147483648", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "1", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "1"}}), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0,0,0}} {getColumnDimension=4, getData=[[1, 0, 0, 0]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0]], getDataRef=[[1, 0, 0, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRo...#314#1511232621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-36", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}), new String[][]{{"getRowMatrix", "int", "2"}, {"subtract", "org.apache.commons.math.linear.BigMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:2>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:66>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "4"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<empty>", "4", "8388508"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "-9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483647", "27", "-59", "27"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-1.7976931348623157E308},{Infinity}} {getColumnDimension=1, getData=[[-1.7976931348623157E308], [Infinity]], getDataRef=[[-1.7976931348623157E308], [Infinity]], getDeterminant=!Invalid...#322#-612413249", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "-36", "-2147483648", "1", "-9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:2>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "solve", "org.apache.commons.math.linear.BigMatrix", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"0", "13", "-268435526", "2033"}, false, 9, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"0", "0", "-268435526", "2033"}, false, 9, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<sample:2>", "27", "-1073741824"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{2.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[2.0], [Infinity], [-Infinity]], getDataRef=[[2.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#2055135684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "double[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "NaN"}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:0>", "-1073741788", "-2147483648"}}), new String[][]{{"getRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "solve", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0]], getDataRef=[[0.0, 0.0], [0.0, 0.0]], getDeterminant=0.0, getNorm=0.0, getRowDimension=2, getTrace=0.0, isSi...#227#1879186621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{}, 2), new String[][]{{"inverse", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getTrace", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:6>", "8388581", "44"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRow", new String[]{"int"}, new String[]{"8388581"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:0>", "4", "2147483647"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"1"}, false, 8, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0}} {getColumnDimension=1, getData=[[0.0]], getDataRef=[[0.0]], getDeterminant=0.0, getNorm=0.0, getRowDimension=1, getTrace=0.0, isSingular=true, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "luDecompose", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "operate", "double[]", "<empty>"}}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "2"}, {"operate", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:3>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", "java.math.BigDecimal", "2E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:3>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", "java.math.BigDecimal", "2E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1.0000000000000000000000000000000000000000000000000000000000000000}} {getColumnDimension=1, getData=[[1.00000000000000000000000000000000000000000000000000000000.., getDataAsDoubleArray=...#591#-469470941", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<empty>", "13", "536870922"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:1>", "<sample:4>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:7>"}}, 2), new String[][]{{"scalarMultiply", "java.math.BigDecimal", "4"}, {"preMultiply", "org.apache.commons.math.linear.BigMatrix", "3"}, {"getData", "", "6"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[[1, -1]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:5>", "<sample:4>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:7>"}}, 2), new String[][]{{"setScale", "int", "3"}, {"copy", "", "2"}, {"getColumnMatrix", "int", "6"}, {"getRowAsDoubleArray", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "1.63"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:8>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}}, 3), new String[][]{{"getTrace", "", "1"}, {"getRowMatrix", "int", "5"}, {"getColumnMatrix", "int", "3"}, {"preMultiply", "java.math.BigDecimal[]", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[0E-64]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:2>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}}), new String[][]{{"getRowDimension", "", "5"}, {"getRowMatrix", "int", "2"}, {"getColumnMatrix", "int", "6"}, {"add", "org.apache.commons.math.linear.BigMatrix", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0000000000000000000000000000000000000000000000000000000000000000}} {getColumnDimens...#695#-1009770123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:4>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}}, 3), new String[][]{{"getRowDimension", "", "7"}, {"getEntryAsDouble", "int,int", "5"}, {"getColumnMatrix", "int", "6"}, {"add", "org.apache.commons.math.linear.BigMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2147475501"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:2>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "-46"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "33", "2074", "4161", "4030"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:66>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "10", "-17", "-268435526", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"-36"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<empty>", "-268435526", "2"}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:0>", "536870922", "536870922"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "1"}}, 1), new String[][]{{"isSquare", "", "5"}, {"multiply", "org.apache.commons.math.linear.RealMatrixImpl", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-Infinity,-2.0},{-Infinity,-Infinity},{Infinity,Infinity}} {getColumnDimension=2, getData=[[-Infinity, -2.0], [-Infinity, -Infinity], [Infinity, Infin.., getDataRef=[[-Infinity, -2.0],...#390#449638316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", ""}}, 2), new String[][]{{"operate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "copy", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", "java.math.BigDecimal", "-1E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}, 2), new String[][]{{"getRoundingMode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:2>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "13"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "2147483647"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "0"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:2>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", ""}}, 3), new String[][]{{"multiply", "org.apache.commons.math.linear.RealMatrixImpl", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", ""}}, 1), new String[][]{{"isSquare", "", "7"}, {"add", "org.apache.commons.math.linear.RealMatrixImpl", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}), new String[][]{{"getNorm", "", "1"}, {"getTrace", "", "2"}, {"solve", "org.apache.commons.math.linear.RealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:1>"}}, 3), new String[][]{{"inverse", "", "7"}, {"solve", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "java.math.BigDecimal[]", "<sample:2>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<sample:0>"}}, 2), new String[][]{{"getColumnAsDoubleArray", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", "int", "1"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}}, 1), new String[][]{{"getRow", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[0E-64, 1.0000000000000000000000000000000000000000000000000000000000000000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0},{0,1}} {getColumnDimension=2, getData=[[1, 0], [0, 1]], getDataAsDoubleArray=[[1.0, 0.0], [0.0, 1.0]], getDataRef=[[1, 0], [0, 1]], getDeterminant=1.0000000000000000000000000000000...#337#284588053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}), new String[][]{{"scalarAdd", "java.math.BigDecimal", "2"}, {"copy", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0,-1,-1,-1},{-1.0000000000000000000000000000000000000000000000000000000000000000,0E-64,-1.0000000000000000000000000000000000000000000000000000000000000000,-1.000000000000000000000000000...#1236#-1343534880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:0>", "2147483647", "8388508"}, {"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "org.apache.commons.math.linear.BigMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}}, 2), new String[][]{{"getDataRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[[1, 0, 0, 0], [0E-64, 1.0000000000000000000000000000000000000000000000000000000000000000, 0E-64, 0E-64], [0E-64, 0E-64, 1.00000000000000000000000000000000000000000000000000000000000000000000000000000...#480#-652929071", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:0>", "0", "8388581"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getData", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "9"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[[0, 1]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0,1}} {getColumnDimension=2, getData=[[0, 1]], getDataAsDoubleArray=[[0.0, 1.0]], getDataRef=[[0, 1]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDimens...#288#627524037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#1120#-715000135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "2147483647"}, {"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "-536870855"}}, 3), new String[][]{{"getColumnAsDoubleArray", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-1011428905656140431"}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "inverse", ""}}), new String[][]{{"copy", "", "4"}, {"getRowDimension", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-2.14175"}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "double[]", "<sample:1>"}}, 2), new String[][]{{"scalarMultiply", "double", "2"}, {"add", "org.apache.commons.math.linear.RealMatrix", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-290.0"}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2), new String[][]{{"solve", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0034602076124567475]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getEntry", "int,int", "0", "-260046875"}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:3>", "2033", "2147475501"}}, 3), new String[][]{{"getDataRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "4030"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<d:30.019999999999996>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:11>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:4>"}}, 1), new String[][]{{"transpose", "", "2"}, {"getRowAsDoubleArray", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "-1.0"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "-1.0"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "-1.0"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1), new String[][]{{"getEntry", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "290.0"}, {"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null}} {getColumnDimension=11, getData=[[null, null, null, null, null, null, null, null, null, null.., getDataAsDoubleArray=!NullPointe...#477#-1868654149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null},{null,null,null,null,null,null,null,null,null,null,null},{null,null,null...#991#1718914986", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getDeterminant", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0}} {getColumnDimension=2, getData=[[1, 0]], getDataAsDoubleArray=[[1.0, 0.0]], getDataRef=[[1, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDimens...#288#-697995933", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0},{0,1}} {getColumnDimension=2, getData=[[1, 0], [0, 1]], getDataAsDoubleArray=[[1.0, 0.0], [0.0, 1.0]], getDataRef=[[1, 0], [0, 1]], getDeterminant=1.0000000000000000000000000000000...#337#644947672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0,0}} {getColumnDimension=3, getData=[[1, 0, 0]], getDataAsDoubleArray=[[1.0, 0.0, 0.0]], getDataRef=[[1, 0, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4,...#301#-1947616674", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0},{0,1,0},{0,0,1}} {getColumnDimension=3, getData=[[1, 0, 0], [0, 1, 0], [0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0], [0.0, 1.0, 0.0], [0.0, 0.0, 1.0]], getDataRef=[[1, 0, 0]...#410#684458801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1E+100}} {getColumnDimension=1, getData=[[1E+100]], getDataAsDoubleArray=[[1.0E100]], getDataRef=[[1E+100]], getDeterminant=1E+100, getNorm=100000000000000000000000000000000000000000000...#319#-548877752", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100}} {getColumnDimension=1, getData=[[1E+100]], getDataAsDoubleArray=[[1.0E100]], getDataRef=[[1E+100]], getDeterminant=1E+100, getNorm=100000000000000000000000000000000000000000000...#319#-548877752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:Pc>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0,0,0}} {getColumnDimension=4, getData=[[1, 0, 0, 0]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0]], getDataRef=[[1, 0, 0, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRo...#314#1511232621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:1>"}}, 3), new String[][]{{"getRowMatrix", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "1", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "1"}}, 3), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,...#1581#-49324059", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,...#327211#-1417640348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RealMatrixImpl{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:->"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "4"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:->"}, false, 3, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "4"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:->"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "4"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "4"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "-9"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:10>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "-1E+100"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:12>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "-1E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "-9"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "-9"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "-18"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "-20"}, {"org.apache.commons.math.linear.BigMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0....#570#2117343766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-Infinity, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#102408#-794241346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-Infinity, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#102408#-794241346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#261838#892605830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "8388508", "27"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"-1073741824"}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "1E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"1"}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "1E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0},{1}} {getColumnDimension=1, getData=[[0], [1]], getDataAsDoubleArray=[[0.0], [1.0]], getDataRef=[[0], [1]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getR...#296#-2051475187", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0},{0,1}} {getColumnDimension=2, getData=[[1, 0], [0, 1]], getDataAsDoubleArray=[[1.0, 0.0], [0.0, 1.0]], getDataRef=[[1, 0], [0, 1]], getDeterminant=1.0000000000000000000000000000000...#337#644947672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "1E+100"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1},{0}} {getColumnDimension=1, getData=[[1], [0]], getDataAsDoubleArray=[[1.0], [0.0]], getDataRef=[[1], [0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getR...#296#-65645269", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0},{0,1}} {getColumnDimension=2, getData=[[1, 0], [0, 1]], getDataAsDoubleArray=[[1.0, 0.0], [0.0, 1.0]], getDataRef=[[1, 0], [0, 1]], getDeterminant=1.0000000000000000000000000000000...#337#644947672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<null>", "-2147483648", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,0}} {getColumnDimension=2, getData=[[-1, 0]], getDataAsDoubleArray=[[-1.0, 0.0]], getDataRef=[[-1, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDi...#292#1685135297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<null>", "-2147483648", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0}} {getColumnDimension=1, getData=[[1E+100], [0]], getDataAsDoubleArray=[[1.0E100], [0.0]], getDataRef=[[1E+100], [0]], getDeterminant=!InvalidMatrixException, getNorm=1000000...#376#-1723024226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<null>", "-2147483648", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<null>", "-2147483648", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "4030"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:1>", "-1073741824", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,1E+100}} {getColumnDimension=2, getData=[[-1, 1E+100]], getDataAsDoubleArray=[[-1.0, 1.0E100]], getDataRef=[[-1, 1E+100]], getDeterminant=!InvalidMatrixException, getNorm=10000000000...#372#717995094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "4030"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0},{0,1}} {getColumnDimension=2, getData=[[1, 0], [0, 1]], getDataAsDoubleArray=[[1.0, 0.0], [0.0, 1.0]], getDataRef=[[1, 0], [0, 1]], getDeterminant=1.0000000000000000000000000000000...#337#644947672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "4030"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0},{0,1,0},{0,0,1}} {getColumnDimension=3, getData=[[1, 0, 0], [0, 1, 0], [0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0], [0.0, 1.0, 0.0], [0.0, 0.0, 1.0]], getDataRef=[[1, 0, 0]...#410#684458801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"-268435526", "-7", "-2147483648", "-891"}, false, 8, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:13>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumn", new String[]{"int"}, new String[]{"2"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "isSquare", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}), new String[][]{{"getRowDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}), new String[][]{{"preMultiply", "double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}), new String[][]{{"preMultiply", "double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "copy", ""}}), new String[][]{{"preMultiply", "double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "27"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=5, getData=[[0.0, 0.0, 0.0, 0.0,...#458#1595752866", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "-33"}}), new String[][]{{"solve", "double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}), new String[][]{{"getRow", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", new String[]{"int", "int"}, new String[]{"27", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1E+100},{0}} {getColumnDimension=1, getData=[[1E+100], [0]], getDataAsDoubleArray=[[1.0E100], [0.0]], getDataRef=[[1E+100], [0]], getDeterminant=!InvalidMatrixException, getNorm=1000000...#376#-1723024226", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0}} {getColumnDimension=1, getData=[[1E+100], [0]], getDataAsDoubleArray=[[1.0E100], [0.0]], getDataRef=[[1E+100], [0]], getDeterminant=!InvalidMatrixException, getNorm=1000000...#376#-1723024226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1}} {getColumnDimension=1, getData=[[1]], getDataAsDoubleArray=[[1.0]], getDataRef=[[1]], getDeterminant=1, getNorm=1, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=1, isS...#229#-1918147753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "isSquare", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:1>"}}), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0,0,0}} {getColumnDimension=4, getData=[[1, 0, 0, 0]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0]], getDataRef=[[1, 0, 0, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRo...#314#1511232621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:1>"}}), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,...#1581#-49324059", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,...#327211#-1417640348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "1", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:1>"}}), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0,0,0}} {getColumnDimension=4, getData=[[1, 0, 0, 0]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0]], getDataRef=[[1, 0, 0, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRo...#314#1511232621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-59", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "1"}}), new String[][]{{"getRowMatrix", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1,0,0,0,0}} {getColumnDimension=5, getData=[[1, 0, 0, 0, 0]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0, 0.0]], getDataRef=[[1, 0, 0, 0, 0]], getDeterminant=!InvalidMatrixException, get...#327#978860244", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}} {getColumnDimension=5, getData=[[1, 0, 0, 0, 0], [0, 1, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0.., getDataAsDoubleArray=[[1.0, 0....#515#843683922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-59", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-59", "-2147483648"}}), new String[][]{{"getRowMatrix", "int", "2"}, {"subtract", "org.apache.commons.math.linear.BigMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-59", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrix", "<sample:0>"}}), new String[][]{{"getRowMatrix", "int", "2"}, {"subtract", "org.apache.commons.math.linear.BigMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-36", "-2147483648"}, {"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}), new String[][]{{"getRowMatrix", "int", "2"}, {"subtract", "org.apache.commons.math.linear.BigMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSingular", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:2>", "8388508", "-2147483648"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0....#878#-1257099844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumn", new String[]{"int"}, new String[]{"27"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RealMatrixImpl{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "8388508"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null},{null,null,null}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#409#-969067036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null,null},{null,null,null,null},{null,null,null,null}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null,null},{null,null,null,null},{null,null,null,null}} {getColumnDimension=4, getData=[[null, null, null, null], [null, null, null, null], [null, .., getDataAsDoubleArray=!Nu...#485#-1172069438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "-9"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "2"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<null>", "4", "8388508"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "-9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:1>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:1>", "-1", "-36"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "1E+100"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<empty>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "-1E+100"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSquare", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "-1011428905656140431"}, {"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "-9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483647", "27", "-59", "27"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}), new String[][]{{"isSingular", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483647", "27", "-59", "27"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}), new String[][]{{"getEntry", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483647", "27", "-59", "27"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}), new String[][]{{"multiply", "org.apache.commons.math.linear.RealMatrix", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0], [Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, ...#294#977923792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0....#564#2112532356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-1.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-1.0,0.0}} {getColumnDimension=2, getData=[[-1.0, 0.0]], getDataRef=[[-1.0, 0.0]], getDeterminant=!InvalidMatrixException, getNorm=1.0, getRowDimension=1, getTrace=!IllegalArgumentExce...#239#-1637614759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0}} {getColumnDimension=1, getData=[[1.0]], getDataRef=[[1.0]], getDeterminant=1.0, getNorm=1.0, getRowDimension=1, getTrace=1.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0....#570#2117343766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{...#788#712286878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntry", new String[]{"int", "int"}, new String[]{"-33", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrixImpl", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0....#682#-1413943000", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0....#878#-1257099844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrixImpl", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,...#984#384519454", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#1120#-715000135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-Infinity, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "isSingular", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#102408#-794241346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,0}} {getColumnDimension=2, getData=[[-1, 0]], getDataAsDoubleArray=[[-1.0, 0.0]], getDataRef=[[-1, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDi...#292#1685135297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"-9", "-20", "-33", "-33"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,0}} {getColumnDimension=2, getData=[[-1, 0]], getDataAsDoubleArray=[[-1.0, 0.0]], getDataRef=[[-1, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDi...#292#1685135297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "8388508", "10"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,0}} {getColumnDimension=2, getData=[[-1, 0]], getDataAsDoubleArray=[[-1.0, 0.0]], getDataRef=[[-1, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDi...#292#1685135297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:10>"}, false, 8, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "8388508", "55"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{-1,0}} {getColumnDimension=2, getData=[[-1, 0]], getDataAsDoubleArray=[[-1.0, 0.0]], getDataRef=[[-1, 0]], getDeterminant=!InvalidMatrixException, getNorm=1, getRoundingMode=4, getRowDi...#292#1685135297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"4194254"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", new String[]{"int"}, new String[]{"-59"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "-59"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "hashCode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:2>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "8388508", "10", "27", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "4", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "-33"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "-33"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "4030"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "4030"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "4030"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getEntry", new String[]{"int", "int"}, new String[]{"2", "10"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:2>", "4030", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "-20"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} {getColumnDimension=4, getData=[[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]], getDataAsDoubleArray=[[1.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0...#483#178019951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "-20"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}} {getColumnDimension=5, getData=[[1, 0, 0, 0, 0], [0, 1, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0.., getDataAsDoubleArray=[[1.0, 0....#515#843683922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"java.math.BigDecimal[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"0", "27", "-9", "4030"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"-9", "-27", "1073741810", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "0.5"}, {"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<s:x>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"-9", "8388581", "536870922", "1073741823"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "0.5"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{2.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[2.0], [Infinity], [-Infinity]], getDataRef=[[2.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#2055135684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", ""}}, 3), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[2.0], [Infinity], [-Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}}, 3), new String[][]{{"solve", "double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}}), new String[][]{{"solve", "double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "double[]", "<sample:2>"}}, 3), new String[][]{{"solve", "double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "-1011428905656140431"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{2.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[2.0], [Infinity], [-Infinity]], getDataRef=[[2.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#2055135684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "-1011428905656140431"}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:0>", "-1073741824", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{2.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[2.0], [Infinity], [-Infinity]], getDataRef=[[2.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#2055135684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "-1011428905656140431"}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:0>", "-1073741788", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-Infinity,-2.0}} {getColumnDimension=2, getData=[[-Infinity, -2.0]], getDataRef=[[-Infinity, -2.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#-1745323292", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int[],int[]", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "NaN"}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:0>", "-1073741788", "-2147483648"}}, 3), new String[][]{{"getRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "NaN"}}), new String[][]{{"getRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"-20"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<null>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", new String[]{"java.math.BigDecimal"}, new String[]{"1.0E-11"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:0>", "13", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}}, 2), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"inverse", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0]], getDataRef=[[0.0, 0.0], [0.0, 0.0]], getDeterminant=0.0, getNorm=0.0, getRowDimension=2, getTrace=0.0, isSi...#227#1879186621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
}
