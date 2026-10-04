package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"0", "1", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:6>", "2147483647", "0", "10", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"0", "1", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "2147483646", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:6>", "2147483647", "40", "10", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,NaN,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, NaN, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#1400586576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", "int,org.apache.commons.math.linear.RealVector", "40", "<sample:6>"}}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{3.0,3.0,3.0},{3.0,3.0,3.0}} {getColumnDimension=3, getData=[[3.0, 3.0, 3.0], [3.0, 3.0, 3.0]], getFrobeniusNorm=7.3484692283495345, getNorm=6.0, getRowDimension=2, getTrace=!NonSquare...#232#-1736238059", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "2", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,0.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, 0.0, -1.0], [-1.0, -.., getFrobeniusNorm=3.31...#296#1833923190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 1), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealMatrix", "3"}, {"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "2147483646", "<sample:2>"}}, 2), new String[][]{{"addToEntry", "int,int,double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,Infinity,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,...#25904#1396178191", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0...#25889#1693451081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int,int,int,int", "-2147483648", "10", "1", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", "int,org.apache.commons.math.linear.RealVector", "2147483647", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"10", "-2147483648", "0.0"}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"-18", "2147483609", "2.0"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", "int", "5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"10", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-2147483648", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int,int,int,int,double[][]", "1", "10", "-1", "2147483647", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#771#1201705424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int,int,int,int,double[][]", "1", "10", "-1", "2147483647", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2301#-1684543647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int,int,int,int,double[][]", "1", "10", "-1", "2147483647", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", "int,double[]", "0", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0...#25889#1693451081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int,int,int,int,double[][]", "1", "10", "-1", "2147483647", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", "int,double[]", "0", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0...#261792#878735499", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"0", "1", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "2147483646", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:6>", "2147483647", "40", "10", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:2>", "2147483647", "1064", "40", "-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:0>", "2147483647", "1", "-2147483647", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "2147483646", "-2147483647", "-5962461716457143437"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "-0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0}} {getColumnDimension=4, getData=[[1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0,.., getFrobeniusNorm=3.4641016151377...#288#856564380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, getData=[[Infinity, Infinity, Infinity, Infi...#343#1311812323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0}} {getColumnDimension=4, getData=[[1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0,.., getFrobeniusNorm=3.4641016151377...#288#856564380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, getData=[[Infinity, Infinity, Infinity, Infi...#343#1311812323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:4>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,I...#4810#-261427924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:6>", "1", "1", "1", "-1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", "int,double[]", "-2147483648", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "0", "40", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2098#-13526597", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2301#-1684543647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "NaN"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,NaN,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, NaN, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=NaN, getNorm=Na...#273#-1847046438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "1", "-2147483648", "2147483646", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "1", "-2147483648", "2147483646", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:7>"}}, 1), new String[][]{{"power", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "1", "-2147483648", "2147483646", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 1), new String[][]{{"power", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"1", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "2.147483646954E9"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", "int,int", "522", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "2.147483646954E9"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:12>"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.46>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}}, 3), new String[][]{{"getColumnMatrix", "int", "6"}, {"getNorm", "", "5"}, {"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "22"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:4>"}}, 1), new String[][]{{"add", "org.apache.commons.math.linear.BlockRealMatrix", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "201"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:4>"}}, 3), new String[][]{{"add", "org.apache.commons.math.linear.BlockRealMatrix", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "2"}}, 1), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[3.0, 3.0, 3.0], [3.0, 3.0, 3.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "2"}}, 1), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "1"}}, 1), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixException...#217#675834461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-2147483648", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-5962461716457143437"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-2147483648", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{-5.9624617164571433E18,-5.9624617164571433E18,-5.9624617164571433E18,-5.9624617164571433E18},{-5.9624617164571433E18,-5.9624617164571433E18,-5.9624617164571433E18,-5.962461716457143...#536#-1779027808", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", "int,double[]", "1", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int", "int", "int", "int", "double[][]"}, new String[]{"-2147483648", "0", "-2147483648", "2147483647", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"2147483646", "-1", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:3>", "-1", "2147483647", "2147483646", "2147483646"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"-2147483648", "0", "-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2147483646", "-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"0", "-2147483648", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"10", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:4>", "1", "2147483646", "1", "1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"10", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-2147483648", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "1", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<null>", "-2147483648", "10"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<empty>", "-2147483648", "10"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:3>", "1", "2147483647", "2147483646", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=6...#393#1620126955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:3>", "1", "2147483647", "2147483646", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infini...#539#-645880819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:5>", "-2147483648", "0", "2147483646", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2085885064", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "40", "40", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"-2147483647", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "0", "40", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<null>", "2147483647", "1", "40", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, getData=[[Infinity, Infinity, Infinity, Infi...#343#1311812323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity,Infinity...#1058#-218520215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "1", "1", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<empty>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2301#-1684543647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"2147483647", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "0", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:0>", "-1", "2147483646", "40", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "10", "-2147483648", "0.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", "int,double[]", "2147483646", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", "int,double[]", "2147483646", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int,int,int,int,double[][]", "-2147483648", "-2147483647", "40", "40", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#771#1201705424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2301#-1684543647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0...#2829#201651164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-...#5322#-1193394388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2301#-1684543647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0...#25889#1693451081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:5>", "1", "-2147483647", "1", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-2.9812308582285716E18"}, false), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity}} {getColumnDimension=3, getData=[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infini.., getFrobeniusNorm=Infinity, g...#287#469791237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0}} {getColumnDimension=4, getData=[[1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0,.., getFrobeniusNorm=3.4641016151377...#288#856564380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "0", "40", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#396#-460358473", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", "int,double[]", "-2147483648", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "0", "40", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#568#745817587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#771#1201705424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:6>", "1", "1", "1", "-1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", "int,double[]", "-2147483648", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "0", "40", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2098#-13526597", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#2301#-1684543647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "1", "-2147483648", "2147483646", "2147483646"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:7>"}}), new String[][]{{"power", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "power", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", "int,org.apache.commons.math.linear.RealVector", "-40", "<sample:6>"}}), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", "int,int", "522", "-57"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "1.073741823477E9"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonS...#237#-1609116183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity}} {getColumnDimension=3, getData=[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infini.., getFrobeniusNorm=Infinity, g...#287#469791237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", "int,int", "522", "-57"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "1.073741823477E9"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}}), new String[][]{{"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int[]", "int[]", "double[][]"}, new String[]{"<null>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "40", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:0>", "2147483646", "2147483646", "0", "40"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "power", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-2147483647", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-2147483647", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"1", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", new String[]{"int", "double[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", new String[]{"int", "double[]"}, new String[]{"63", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "org.apache.commons.math.linear.RealVector", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "-2147483648", "40", "-2147483648", "1"}}), new String[][]{{"getColumnVector", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixException...#217#675834461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"40", "10", "-1", "2147483646"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "40"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}), new String[][]{{"operate", "org.apache.commons.math.linear.RealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "22"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:4>"}}), new String[][]{{"multiplyEntry", "int,int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:6>", "40", "-1", "2147483646", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", "int,org.apache.commons.math.linear.RealVector", "0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "-2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "1"}}), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"-2147483647", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "0"}}), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:6>", "-2147483648", "-2147483647", "2147483646", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "2147483646", "1", "2147483646", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infini...#539#-645880819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:2>", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "10", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<empty>", "-1", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"-2147483647", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "-2147483648", "-2147483648", "-5962461716457143437"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "40", "1", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"40", "10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#1901#-1283291778", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"40", "10"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#1901#-1283291778", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"-4056", "10"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"-1", "2147483647", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"-1", "2147483638", "2147483647"}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int,int,int,int", "2147483646", "0", "20", "10"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "1", "0", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int[]", "int[]", "double[][]"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"0", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0},{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0], [0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=3, getTrace=!NonSquareMatrixExc...#223#-149982336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"2147483647", "2147483391", "0.0"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int[],int[],double[][]", "<sample:2>", "<empty>", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "0", "0", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"1", "-2147483647", "2.1950000000000003"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "0", "0", "-0.34"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"268435457", "2147483647", "-4.01"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "0", "0", "-0.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "power", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=6...#393#1620126955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0},{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0], [0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=3, getTrace=!NonSquareMatrixExc...#223#-149982336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "2147483638", "2147483647", "-5962461716457143437"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "0", "-2147483648", "-5962461716457143437"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0} {getDataRef=[0.0, 0.0], getDimension=2, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=1, getMaxValue=0.0, getMinIndex=1, getMinValue=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getDataRef=[0.0, 0.0, 0.0], getDimension=3, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"10", "1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0}} {getColumnDimension=1, getData=[[0.0], [0.0], [0.0], [0.0], [0.0], [0.0], [0.0], [0.0], [0..., getFrobeniusNorm=0.0, getN...#280#-206587923", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}), new String[][]{{"getLInfNorm", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}), new String[][]{{"combineToSelf", "double,double,org.apache.commons.math.linear.RealVector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"54"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "10"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}, 1), new String[][]{{"getEntry", "int", "3"}, {"getLInfDistance", "org.apache.commons.math.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", new String[]{"int"}, new String[]{"40"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"0", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:3>", "2147483638", "10", "0", "2147483638"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<sample:2>", "2147483647", "2147483646"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"-432"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:6>", "2147483638", "-1", "-2147483647", "36"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-15", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}, 2), new String[][]{{"getMinValue", "", "1"}, {"unitize", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"20", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"2147483647", "<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "double[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", ""}}), new String[][]{{"mapAdd", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (Infinity)} {getDataRef=[Infinity, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=1, getMinValue=Infinity, getNorm=I...#238#708519517", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", ""}}, 1), new String[][]{{"mapAdd", "double", "4"}, {"mapAddToSelf", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (Infinity)} {getDataRef=[Infinity, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=1, getMaxValue=Infinity, getMinIndex=1, getMinValue=Infinity, getNorm=I...#238#708519517", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}}, 1), new String[][]{{"mapAdd", "double", "4"}, {"mapAddToSelf", "double", "7"}, {"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", "int,int,double", "-2147483647", "2147483646", "-1.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}}), new String[][]{{"append", "org.apache.commons.math.linear.ArrayRealVector", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 1; (Infinity); (-Infinity)} {getDataRef=[0.0, 0.0, 1.0, Infinity, -Infinity], getDimension=5, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=3, getMaxValue=Infinity, getMinIndex=4, getMi...#265#-1858216891", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{2.147483646E9,2.147483646E9,2.147483646E9},{2.147483646E9,2.147483646E9,2.147483646E9}} {getColumnDimension=3, getData=[[2.147483646E9, 2.147483646E9, 2.147483646E9], [2.147483646.....#333#-911228710", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}}), new String[][]{{"append", "org.apache.commons.math.linear.ArrayRealVector", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 0; 1; (Infinity); (-Infinity)} {getDataRef=[0.0, 0.0, 0.0, 1.0, Infinity, -Infinity], getDimension=6, getL1Norm=Infinity, getLInfNorm=Infinity, getMaxIndex=4, getMaxValue=Infinity, getMinIndex=...#273#1940205773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", "int,int", "20", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "40"}}), new String[][]{{"getRowVector", "int", "2"}, {"setEntry", "int,double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "1", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,1.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=1.0, getNorm=1....#273#845033002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "1", "-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,-1.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, -1.0, 0.0, 0.0], [0.0, 0.0, 0.0.., getFrobeniusNorm=1.0, getNorm=1...#274#1601716966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "1", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,1.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 1.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=1.0, getNorm=1....#273#1207530282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "1", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,1.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 1.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=1.0, getNorm=1....#273#845033002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"41", "1", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "0", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "1", "10.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "0", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,10.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 10.0, 0.0, 0.0], [0.0, 0.0, 0.0.., getFrobeniusNorm=10.0, getNorm=...#276#984864454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "1", "-2.8000000000000003"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "0", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,-2.8000000000000003,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, -2.8000000000000003, 0.0, 0.0],.., getFrobeniusNorm...#319#442600201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"1", "2", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "0", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,1.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 1.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=1.0, getNorm=1....#273#1660939148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int[]", "int[]", "double[][]"}, new String[]{"<empty>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,0.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, 0.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, -.., getFrobeniusNorm=3.31...#296#-763275342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealVector", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,1.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 1.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=1.0, getNorm=1....#273#-646194420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,0.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, 0.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, -.., getFrobeniusNorm=3.31...#296#-763275342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "-2", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.7976931348623157E308,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.7976931348623157E308, -1.0], [-1.0, -1.0, -.., g...#328#224402393", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,1.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 1.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=1.0, getNorm=1....#273#-646194420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,0.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, 0.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.23606797749979, getNorm=2.0, getRowDimension=2, getTrace=...#242#554893855", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "2", "1.0"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,0.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0,...#2827#197405316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:4>", "0", "2147483646", "0", "-2147483647"}}), new String[][]{{"multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<null>", "2147483646", "2147483647", "-2147483647", "1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:3>", "2147483646", "-2147483647", "2147483638", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:3>", "2147483646", "-2147483647", "2147483638", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "0", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:4>", "20", "2147483638", "40", "1"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:5>", "-1", "69", "-1", "2147483646"}}, 2), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0...#457#-1644896158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0...#598#1789985675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0...#771#1201705424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-5962461716457143437"}, false, 0, null, 2), new String[][]{{"getColumnVector", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:7>", "0", "-2147483648", "10", "40"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<null>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
