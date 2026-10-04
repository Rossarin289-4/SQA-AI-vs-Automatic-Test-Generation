package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{NaN,NaN,NaN},{NaN,NaN,NaN}} {getColumnDimension=3, getData=[[NaN, NaN, NaN], [NaN, NaN, NaN]], getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1714716276", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"2139095038", "<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "1", "1", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "0", "2.147483647E8"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{2.147483647E8,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[2.147483647E8, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=2.147483647E8, getNorm=2.147483647E8, getRowDimen...#259#-155646590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"1", "0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "2147483646", "-35", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{NaN,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [NaN, 0.0, 0.0]], getFrobeniusNorm=NaN, getNorm=NaN, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#1744045200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}}), new String[][]{{"addToEntry", "int,int,double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0.0,...#271#-738243993", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0}} {getColumnDimension=4, getData=[[1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0,.., getFrobeniusNorm=3.4641016151377...#288#856564380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:0>"}}), new String[][]{{"getColumnMatrix", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0},{0.0}} {getColumnDimension=1, getData=[[0.0], [0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", ""}}, 1), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:2>", "-2147483648", "2147483647", "-2097140", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"1073741768", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int[]", "int[]", "double[][]"}, new String[]{"<sample:3>", "<empty>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:8>", "-2147483648", "-4194304", "2147483646", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", "int,double[]", "2147483647", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"8388608", "-28"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"0", "-2147483648", "2.1474836470000002E9"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:5>", "-1", "-2147483647", "536870911", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:3>", "129", "-1073741824", "536870911", "1073774591"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"2147483647", "-2147483648", "1.0737418235000001E9"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<null>", "2147483647", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "2.147483647E9"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"2.1474836465600002E9"}, false, 0, null, 2), new String[][]{{"getColumnDimension", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "double[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getData", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", "int,org.apache.commons.math.linear.RealVector", "1073741826", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1756621592", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:3>", "-64", "5", "0", "2147483646"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "1", "2139095294", "-1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-16364", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<b:false>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "power", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"2147483647", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", "int", "4194314"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", "int", "-1073741824"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-12", "<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "2147483647", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:4>", "2147483647", "2147483647", "-8388607", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"2.1474836470380002E8"}, false, 5, new String[][]{}, 2), new String[][]{{"scalarAdd", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"-536870907", "2147483647", "NaN"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:2>", "1", "134217729", "2147483646", "2139095038"}}, 2), new String[][]{{"setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "Infinity"}}, 2), new String[][]{{"getColumnVector", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int[],int[],double[][]", "<empty>", "<sample:0>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int", "int", "int", "int", "double[][]"}, new String[]{"10", "61", "2097152", "-2147483596", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "2147483646", "2139095038", "-4.9E-324"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"2097151"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "-262144", "0", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:6>", "26", "-44", "2139111422", "33554442"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:3>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "double[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN,NaN},{NaN,NaN,NaN,NaN,NaN,NaN}} {getColumnDimension=6, getData=[[NaN, NaN, NaN, NaN...#349#-2070249537", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:11>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "-4", "2147483623"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"2139090814", "<sample:0>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"-2"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<sample:1>", "-2147483648", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"2", "2147483647", "-0.0"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "2147483647", "8192"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:4>", "-181", "4194304", "2147483552", "-10"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:3>", "10", "-2139095038", "2147483646", "1073741823"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "2147483646", "<sample:8>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", "int,int", "-22", "-24"}}, 2), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"-1073741825", "-5", "-2.147483647E9"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", "int", "-2147483136"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "-63", "-511"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<null>", "2147483646", "0", "-2147483648", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", "int,int,int,int,double[][]", "-2147483648", "1", "-2139095038", "1", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:5>", "-61", "2147483647", "2147483647", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0},{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0], [0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=3, getTrace=!NonSquareMatrixExc...#223#-149982336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:7>", "1073741823", "5", "-2147483648", "2139095038"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"1", "1", "-42.0"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"setEntry", "int,int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-1", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<s:bb>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:2>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:10>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<null>", "16777216", "2", "2147483647", "-2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "0.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<s:<B>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"-1", "-2147483637"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int", "int", "int", "int", "double[][]"}, new String[]{"1073741823", "2147483647", "0", "2147483647", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", new String[]{"int"}, new String[]{"2049"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", new String[]{"int", "int", "double"}, new String[]{"1", "2147483647", "-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"-38", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-5.9624617164571423E18"}, false), new String[][]{{"scalarMultiply", "double", "0"}, {"setRow", "int,double[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "32769", "2147483647", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", "int,org.apache.commons.math.linear.RealVector", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-20", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "1.7976931348623157E308"}}), new String[][]{{"addToEntry", "int,int,double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"5", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"0.77"}, false), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "5"}, {"power", "int", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<empty>", "-2147483648", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, getData=[[Infinity, Infinity, Infinity, Infi...#343#1311812323", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"-2147483648", "1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", "int,double[]", "65", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:3>", "1073741823", "2147483646", "-2147450879", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "power", "int", "-2147483648"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:6>", "2147483647", "0", "2147483647", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false), new String[][]{{"getColumnMatrix", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:2>", "0", "1073741823", "1073741823", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "-46"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setEntry", new String[]{"int", "int", "double"}, new String[]{"2147483647", "5", "-1.7976931348623155E308"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"Infinity"}, false), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", new String[]{"int", "int", "double"}, new String[]{"0", "-2147483648", "2.1474836470000002E9"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:5>", "1073741823", "-2147483648", "-2147483648", "-1073741825"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.RealMatrix", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:5>", "10", "-2147483648", "-1", "2147483647"}}), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getDataRef=[0.0, 0.0, 0.0], getDimension=3, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=2, getMaxValue=0.0, getMinIndex=2, getMinValue=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"power", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:0>", "-2146959359", "-2147483648", "-2147483648", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false), new String[][]{{"getFrobeniusNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"-2147483648", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:3>", "35", "-2147483648", "-2147483646", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0},{0.0}} {getColumnDimension=1, getData=[[0.0], [0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"20", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2085885064", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", "int,org.apache.commons.math.linear.RealVector", "2147483587", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<null>", "1073741766", "2147483647", "2147483647", "0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0},{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0], [0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=3, getTrace=!NonSquareMatrixExc...#223#-149982336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int[]", "int[]", "double[][]"}, new String[]{"<null>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"0", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "power", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<sample:1>", "0", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-5.9624617164571423E18"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor", "<sample:6>"}}), new String[][]{{"getColumn", "int", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:5>", "2147483647", "1073741823", "-1073741823", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "operate", "org.apache.commons.math.linear.RealVector", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{}), new String[][]{{"copy", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0},{0.0},{0.0}} {getColumnDimension=1, getData=[[0.0], [0.0], [0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=3, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", ""}}), new String[][]{{"operate", "org.apache.commons.math.linear.RealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "power", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "32", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", "int,org.apache.commons.math.linear.RealVector", "2147483647", "<null>"}}), new String[][]{{"getColumnDimension", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "33554455", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false), new String[][]{{"walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"0", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "power", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"1", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0], [0.0, 0.0, 0.0], [0.0, 0..., getFrobeniusNorm=0.0, getNorm=...#275#424482506", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnVector", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "40", "<sample:6>"}}), new String[][]{{"getRowMatrix", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{-1.7976931348623157E308,-1.7976931348623157E308,-1.7976931348623157E308,-1.7976931348623157E308,-1.7976931348623157E308,-1.7976931348623157E308},{-1.7976931348623157E308,-1.79769313...#959#-2030036424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", "int,org.apache.commons.math.linear.RealVector", "0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infini...#539#-645880819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}), new String[][]{{"setSubMatrix", "double[][],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getData", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"2147483646", "2139095069"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "0", "2147483647", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:1>", "25", "2147483612", "2147483647", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "1610612735", "-2147483648", "5", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "2139062270", "2147483646"}}), new String[][]{{"scalarAdd", "double", "5"}, {"getColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:9>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumn", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getFrobeniusNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<sample:2>", "10", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"0", "<sample:8>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", new String[]{"int", "int"}, new String[]{"54", "1"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", "int", "2139095038"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0...#544#-1465775883", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<null>", "-49", "2139619326"}}), new String[][]{{"setSubMatrix", "double[][],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", "int[],int[]", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "multiplyEntry", "int,int,double", "-2", "27", "2.1474836433000002E9"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<null>", "-2147483648", "2147483647", "2147483647", "2147483605"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<empty>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{}), new String[][]{{"power", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"148"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getTrace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", ""}}), new String[][]{{"setSubMatrix", "double[][],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false), new String[][]{{"getColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnVector", "int,org.apache.commons.math.linear.RealVector", "1073741823", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", new String[]{"int", "double[]"}, new String[]{"-8192", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"-5.9624617164571443E18"}, false), new String[][]{{"getNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1924923432914289E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copySubMatrix", new String[]{"int[]", "int[]", "double[][]"}, new String[]{"<sample:0>", "<sample:0>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:7>", "2147483647", "536870911", "0", "536838143"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-0.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", "int", "0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:0>", "-4", "2147483647", "26", "5"}}), new String[][]{{"getNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"2.147483647E8"}, false), new String[][]{{"isSquare", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BlockRealMatrix", actual.getClass().getName());
  assertEquals("BlockRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixException...#217#675834461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false), new String[][]{{"createMatrix", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "createMatrix", "int,int", "-1073741823", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"0.0"}, false, 4, new String[][]{}), new String[][]{{"preMultiply", "org.apache.commons.math.linear.RealMatrix", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "0", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "power", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "24", "1"}}), new String[][]{{"getRow", "int", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"1", "<sample:10>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", "int", "1073741823"}}), new String[][]{{"multiply", "org.apache.commons.math.linear.RealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "1073741822", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", new String[]{"int", "org.apache.commons.math.linear.RealMatrix"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"2147483646", "5", "-2147483648", "-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "addToEntry", "int,int,double", "-2147483648", "1", "2.0"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "add", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<null>", "10", "10", "1073741813", "2147483646"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRow", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixPreservingVisitor,int,int,int,int", "<sample:3>", "5", "2147483646", "10", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}), new String[][]{{"getColumnDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"getColumnMatrix", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}}), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"0.0"}, false), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setColumn", new String[]{"int", "double[]"}, new String[]{"0", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity}} {getColumnDimension=3, getData=[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infini.., getFrobeniusNorm=Infinity, g...#287#469791237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarAdd", new String[]{"double"}, new String[]{"5.9624617164571433E18"}, false, 5, new String[][]{}), new String[][]{{"operate", "double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", new String[]{"int", "double[]"}, new String[]{"0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false), new String[][]{{"copy", "", "3"}, {"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", "org.apache.commons.math.linear.OpenMapRealMatrix", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity}} {getColumnDimension=3, getData=[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infini.., getFrobeniusNorm=Infinity, g...#287#469791237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "scalarMultiply", new String[]{"double"}, new String[]{"-5962461716457143437"}, false), new String[][]{{"setColumnVector", "int,org.apache.commons.math.linear.RealVector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setRowVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"1", "<sample:6>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0,-1.0}} {getColumnDimension=4, getData=[[-1.0, -1.0, -1.0, -1.0], [-1.0, -1.0, -1.0, -1.0], [-1.0, .., getFrobeniusNorm=3.4...#300#-1615849927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowDimension", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", "double[][],int,int", "<sample:2>", "2139095010", "2147483647"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}}), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0},{1.0,1.0,1.0}} {getColumnDimension=3, getData=[[1.0, 1.0, 1.0], [1.0, 1.0, 1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTrace=!NonSquar...#233#1575188275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "copy", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<empty>", "0", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0},{1.0,1.0,1.0,1.0}} {getColumnDimension=4, getData=[[1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0, 1.0], [1.0, 1.0, 1.0,.., getFrobeniusNorm=3.4641016151377...#288#856564380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setColumnMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-1", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity}} {getColumnDimension=4, getData=[[-Infinity, -Infinity, ...#355#791629090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "2139095038", "1069547519"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getRowVector", "int", "16408"}}), new String[][]{{"getFrobeniusNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "2147483646", "2147483647", "-2147483648", "4100"}}), new String[][]{{"subtract", "org.apache.commons.math.linear.RealMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity,-Infinity,-Infinity,-Infini...#539#-645880819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getColumnMatrix", new String[]{"int"}, new String[]{"1"}, false), new String[][]{{"add", "org.apache.commons.math.linear.RealMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, getData=[[Infinity, Infinity, Infinity, Infi...#343#1311812323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity}} {getColumnDimension=3, getData=[[Infinity, Infinity, Infinity], [Infinity, Infinity, Infini.., getFrobeniusNorm=Infinity, g...#287#469791237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<null>", "1073741823", "2139095038"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:1>", "2139095038", "-2147483647", "2147483647", "2139095038"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "transpose", new String[]{}, new String[]{}, false), new String[][]{{"operate", "org.apache.commons.math.linear.RealVector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "getRowMatrix", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=1, getTrace=!NonSquareMatrixException, isSquare=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRow", "int,double[]", "2147483647", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-1.0,-1.0,-1.0},{-1.0,-1.0,-1.0}} {getColumnDimension=3, getData=[[-1.0, -1.0, -1.0], [-1.0, -1.0, -1.0]], getFrobeniusNorm=2.449489742783178, getNorm=2.0, getRowDimension=2, getTra...#245#-1234382731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "-1", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0...#349#981227330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false), new String[][]{{"walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "isSquare", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity,Infinity,Infinity},{Infinity,Infi...#509#-258152784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "power", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.NonSquareMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInOptimizedOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor,int,int,int,int", "<sample:6>", "24", "2147483647", "2147483647", "-1073741846"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity},{Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, getData=[[Infinity, Infinity, Infinity, Infi...#343#1311812323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixChangingVisitor"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{-Infinity,-Infinity,-Infinity},{-Infinity,-Infinity,-Infinity}} {getColumnDimension=3, getData=[[-Infinity, -Infinity, -Infinity], [-Infinity, -Infinity, -.., getFrobeniusNorm=Infin...#293#1320287654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "equals", "java.lang.Object", "<i:-2147483648>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "getEntry", "int,int", "52", "2147483597"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInColumnOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor", "int", "int", "int", "int"}, new String[]{"<sample:0>", "-1", "2147483645", "2147483647", "2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "preMultiply", "org.apache.commons.math.linear.RealVector", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-727359832", String.valueOf(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}} {getColumnDimension=4, getData=[[0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0,.., getFrobeniusNorm=0.0, getNorm=0....#273#1927130700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "operate", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "setRowMatrix", "int,org.apache.commons.math.linear.RealMatrix", "64", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", new String[]{"org.apache.commons.math.linear.RealMatrixPreservingVisitor"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealMatrix", "walkInRowOrder", "org.apache.commons.math.linear.RealMatrixChangingVisitor", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealMatrix", "org.apache.commons.math.linear.OpenMapRealMatrix", "add", new String[]{"org.apache.commons.math.linear.OpenMapRealMatrix"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealMatrix", actual.getClass().getName());
  assertEquals("OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "OpenMapRealMatrix{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getFrobeniusNorm=0.0, getNorm=0.0, getRowDimension=2, getTrace=!NonSquareMatrixExcepti...#219#-1191535614", SearchInputFactory_scaffolding.receiverState());
 }
}
