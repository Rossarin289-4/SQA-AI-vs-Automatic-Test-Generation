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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:3>", "2147483647", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "inverse", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<sample:2>", "-1", "-20"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "2147483605", "17"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "-1073741822"}, {"org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", "java.math.BigDecimal", "-10114289056561404310"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=2, getTrace=0, isSi...#227#1974227891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getEntry", "int,int", "2147483647", "-1034"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"-0.5"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:0>", "2147483550", "50"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0.5},{-1.5}} {getColumnDimension=1, getData=[[0.5], [-1.5]], getDataAsDoubleArray=[[0.5], [-1.5]], getDataRef=[[0.5], [-1.5]], getDeterminant=!InvalidMatrixException, getNorm=2.0, getRo...#314#-609463742", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getScale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:0>", "2147483647", "-82"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "-2147483648", "2147483647", "24", "-66570"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int[],int[]", "<empty>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "-1034"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-3.0>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:3>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "org.apache.commons.math.linear.BigMatrix", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"solve", "double[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "10", "2147483647", "-58", "71"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<sample:0>", "17", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "inverse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<empty>", "2147483647", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "inverse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "equals", "java.lang.Object", "<i:-38>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", ""}}), new String[][]{{"setSubMatrix", "double[][],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", "int,int,int,int", "-1018", "-2147483592", "2147483647", "-2147483648"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getNorm", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<empty>", "2147483550", "536870920"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"536870920"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "536870920"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"56", "24", "28", "2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:0>", "0", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getScale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:0>", "2147483647", "536870924"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "0"}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:4>"}}), new String[][]{{"isSingular", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483647", "82", "1073741823", "-53"}}), new String[][]{{"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:3>", "74", "1073741840"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", "double[][],int,int", "<sample:3>", "536870928", "2147483647"}, {"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:7>"}}), new String[][]{{"solve", "org.apache.commons.math.linear.RealMatrix", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "operate", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "-49"}}), new String[][]{{"isSquare", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-Infinity,-1.0},{-Infinity,-Infinity},{Infinity,Infinity}} {getColumnDimension=2, getData=[[-Infinity, -1.0], [-Infinity, -Infinity], [Infinity, Infin.., getDataRef=[[-Infinity, -1.0],...#390#59495307", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", "java.math.BigDecimal", "0"}, {"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483615", "2147483647", "2", "2147483647"}}), new String[][]{{"getColumn", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRow", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "multiply", "org.apache.commons.math.linear.BigMatrix", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0},{0.0,0.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 0.0]], getDataRef=[[0.0, 0.0], [0.0, 0.0]], getDeterminant=0.0, getNorm=0.0, getRowDimension=2, getTrace=0.0, isSi...#227#1879186621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{-1,0},{1,0}} {getColumnDimension=2, getData=[[-1, 0], [1, 0]], getDataAsDoubleArray=[[-1.0, 0.0], [1.0, 0.0]], getDataRef=[[-1, 0], [1, 0]], getDeterminant=0, getNorm=2, getRoundingMode...#280#-941497655", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:7>"}}), new String[][]{{"getColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000, -10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...#207#-1379154481", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", "int", "2147483647"}}, 1), new String[][]{{"add", "org.apache.commons.math.linear.BigMatrix", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000}} {getColumnDimension=1, getData=[[100000000000000000000000000000000000000000000000...#630#1731118119", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "-5"}}), new String[][]{{"inverse", "", "6"}, {"getDeterminant", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("2.0000000000000000000000000000000000000000000000000000000000000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}}), new String[][]{{"copy", "", "6"}, {"operate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"luDecompose", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-Infinity,-1.0},{-Infinity,-Infinity}} {getColumnDimension=2, getData=[[-Infinity, -1.0], [-Infinity, -Infinity]], getDataRef=[[-Infinity, -1.0], [-Infinity, -Infinity]], getDeterminan...#296#1391481571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getColumn", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getScale", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...#780#3561011", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}}, 3), new String[][]{{"inverse", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}), new String[][]{{"getRow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...#203#-1912608250", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<sample:0>", "0", "2147483631"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"-59.5"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getData", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:0>"}}), new String[][]{{"setRoundingMode", "int", "5"}, {"solve", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[0.0168067226890756302521008403361344537815126050420168067226890757]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<empty>", "<sample:1>"}}), new String[][]{{"operate", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", "int", "148"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "2147483632", "2147483574", "25", "1073741814"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "0.49999999999999994"}}, 3), new String[][]{{"getColumnMatrix", "int", "6"}, {"getSubMatrix", "int[],int[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "2147483632"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "26"}}), new String[][]{{"getRowMatrix", "int", "2"}, {"add", "org.apache.commons.math.linear.RealMatrix", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{2.0}} {getColumnDimension=1, getData=[[2.0]], getDataRef=[[2.0]], getDeterminant=2.0, getNorm=2.0, getRowDimension=1, getTrace=2.0, isSingular=false, isSquare=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "54"}}), new String[][]{{"scalarMultiply", "java.math.BigDecimal", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=54, getTrace=0, isS...#228#516118646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "hashCode", ""}}), new String[][]{{"getEntry", "int,int", "5"}, {"scalarMultiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"-25"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=-25...#302#1805198590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0},{Infinity},{-Infinity}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", new String[]{"int"}, new String[]{"1073741742"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#409#-969067036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"1073741841"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#397#-683336446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=2147483647, getTrac...#236#1054614537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getScale", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"2147483631"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=2147483631, getTrac...#236#1888791566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-Infinity, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", "int", "1073741791"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#417#571399122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", new String[]{"java.math.BigDecimal"}, new String[]{"-4828886979278117018"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"0.2"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", "int", "50"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"1E+100"}, false, 1, new String[][]{}, 3), new String[][]{{"getRow", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:2>", "-1073741882", "2"}, {"org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", "java.math.BigDecimal[][],int,int", "<sample:1>", "89", "-54"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getData", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getTrace", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"2102"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", "int", "-66612"}, {"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntry", new String[]{"int", "int"}, new String[]{"4", "-20"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"java.math.BigDecimal[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"50"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-1421801337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setSubMatrix", new String[]{"java.math.BigDecimal[][]", "int", "int"}, new String[]{"<sample:3>", "-133160", "1073740790"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:rey>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "-2147483648"}, {"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrixImpl", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "inverse", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "solve", "org.apache.commons.math.linear.RealMatrix", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getData", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumn", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", "int", "-268435497"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "copy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"2147483633"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "isSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "2147483647", "2147483632"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "-15", "50", "20", "148"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", new String[]{"java.math.BigDecimal"}, new String[]{"-48288869792781170180"}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "operate", "java.math.BigDecimal[]", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getEntry", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483620"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getData", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"2147483605"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", "int,int", "2147483631", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#397#-1027899056", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumn", new String[]{"int"}, new String[]{"2147483631"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSingular", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:9>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", "int", "1073741787"}, {"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "org.apache.commons.math.linear.BigMatrix", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"java.math.BigDecimal[]"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", ""}});
  assertNotNull(actual);
  assertEquals("[[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0},{Infinity}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "-25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "multiply", "org.apache.commons.math.linear.RealMatrix", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"java.math.BigDecimal[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", "int,int", "25", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getScale", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "-482888697927811701800"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getEntry", "int,int", "-41", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "isSingular", ""}}), new String[][]{{"solve", "java.math.BigDecimal[]", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[-1, 1E+100, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null}} {getColumnDimension=3, getData=[[null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null]], getDeterminant=!InvalidMatrixException...#352#761380392", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#409#-969067036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "org.apache.commons.math.linear.BigMatrix", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#409#-969067036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"2147483574", "2147483631", "50", "-26"}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "2147483647"}, {"org.apache.commons.math.linear.RealMatrixImpl", "getEntry", "int,int", "2", "-82"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0], [Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", ""}, {"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getTrace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "1073741849"}, {"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "java.math.BigDecimal[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=1073741849, getTrac...#236#-685381903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrix", "<sample:6>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"2147483527"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumn", "int", "2147483574"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"-82"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#411#375207319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int", "int", "int", "int"}, new String[]{"2147483647", "2147483574", "25", "1"}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "equals", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", new String[]{"int"}, new String[]{"4097"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", "int", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{null,null,null},{null,null,null}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#409#-969067036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "solve", "double[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", new String[]{"int", "int"}, new String[]{"1073741822", "54"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrixImpl"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSingular", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0], [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"17"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "add", "org.apache.commons.math.linear.BigMatrix", "<sample:7>"}, {"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-2147483647", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#1391271196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntry", new String[]{"int", "int"}, new String[]{"2147483647", "-16"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1414748357", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getScale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{null,null,null},{null,null,null}} {getColumnDimension=3, getData=[[null, null, null], [null, null, null]], getDataAsDoubleArray=!NullPointerException, getDataRef=[[null, null, null], [n...#409#-969067036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"108"}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "subtract", "org.apache.commons.math.linear.BigMatrixImpl", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#390#1062578911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "org.apache.commons.math.linear.BigMatrix", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getPermutation", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "subtract", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRow", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "org.apache.commons.math.linear.BigMatrix", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"16777196"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "copy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#394#1244878726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "inverse", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getTrace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"2147483604"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=2147483604, getRowDimension=1, getScale=64, getTra...#237#-1517673440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"2147483550"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getNorm", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "operate", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "1073741785", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", new String[]{"int", "int"}, new String[]{"2147483647", "1073741815"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getData", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[[1], [-1]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", "double", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getTrace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"2080374741"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=2080374741, getTrac...#236#-1005496037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{1E+100},{0},{1}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "operate", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRow", new String[]{"int"}, new String[]{"-22"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "isSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setScale", new String[]{"int"}, new String[]{"-1073743870"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=-1073743870, getTra...#237#798423106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "isSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getRow", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRow", new String[]{"int"}, new String[]{"2147483638"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataAsDoubleArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "setRoundingMode", new String[]{"int"}, new String[]{"536870924"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumnMatrix", "int", "-2147483589"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#396#926182422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", "int,int", "-285212618", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "solve", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "0", "2147483631"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "scalarAdd", "java.math.BigDecimal", "10114289056561404310"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowDimension", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "solve", "org.apache.commons.math.linear.RealMatrix", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!NullPointerException, getRowDimension=!NullPo...#313#-1686521556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "add", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "inverse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getEntry", new String[]{"int", "int"}, new String[]{"62", "1023"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.BigMatrix"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getPermutation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getData", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getEntry", "int,int", "10", "-65590"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[-Infinity, -1.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "transpose", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=5, getData=[[0.0, 0.0, 0.0, 0.0,...#458#1595752866", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getColumnAsDoubleArray", new String[]{"int"}, new String[]{"-1034"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}} {getColumnDimension=6, getData=[[0.0, 0.0, 0.0, 0.0, 0...#456#330619424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "-1.01142890565614054E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "org.apache.commons.math.linear.BigMatrix", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1E+100},{0},{1}} {getColumnDimension=1, getData=[[1E+100], [0], [1]], getDataAsDoubleArray=[[1.0E100], [0.0], [1.0]], getDataRef=[[1E+100], [0], [1]], getDeterminant=!InvalidMatrixExcep...#397#-961585231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRoundingMode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int,int,int,int", "-285212618", "-1073741849", "-5", "-25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "2147483632"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", new String[]{"int[]", "int[]"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntry", "int,int", "-82", "1073741775"}, {"org.apache.commons.math.linear.BigMatrixImpl", "luDecompose", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{1.0},{Infinity}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "solve", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getRow", new String[]{"int"}, new String[]{"-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getTrace", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getEntryAsDouble", "int,int", "1107296219", "-2145386496"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getNorm", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getData", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[Ljava.math.BigDecimal;", actual.getClass().getName());
  assertEquals("[[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getColumnMatrix", new String[]{"int"}, new String[]{"16358"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "equals", "java.lang.Object", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "setScale", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowAsDoubleArray", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getSubMatrix", "int[],int[]", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getTrace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "getColumn", "int", "2147483647"}, {"org.apache.commons.math.linear.BigMatrixImpl", "solve", "java.math.BigDecimal[]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "transpose", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "scalarMultiply", "double", "-1.01142890565614054E18"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0], [Infinity], [-Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity},{-Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity], [-Infinity]], getDataRef=[[1.0], [Infinity], [-Infinity]], getDeterminant=!InvalidMatrixException, getNo...#300#1963453637", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "solve", "org.apache.commons.math.linear.BigMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "preMultiply", "java.math.BigDecimal[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.BigMatrixImpl", actual.getClass().getName());
  assertEquals("BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{0}} {getColumnDimension=1, getData=[[0]], getDataAsDoubleArray=[[0.0]], getDataRef=[[0]], getDeterminant=0, getNorm=0, getRoundingMode=4, getRowDimension=1, getScale=64, getTrace=0, isS...#228#-1807909193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "add", "org.apache.commons.math.linear.RealMatrix", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.RealMatrixImpl", actual.getClass().getName());
  assertEquals("RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{-Infinity,-1.0}} {getColumnDimension=2, getData=[[-Infinity, -1.0]], getDataRef=[[-Infinity, -1.0]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=1, getTra...#262#1398579813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "operate", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getRowMatrix", new String[]{"int"}, new String[]{"-41"}, false, 2, new String[][]{{"org.apache.commons.math.linear.BigMatrixImpl", "transpose", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "setSubMatrix", new String[]{"double[][]", "int", "int"}, new String[]{"<sample:3>", "-20", "148"}, false, 0, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", ""}, {"org.apache.commons.math.linear.RealMatrixImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDeterminant", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "getRowMatrix", "int", "-26"}, {"org.apache.commons.math.linear.RealMatrixImpl", "inverse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.InvalidMatrixException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getColumnDimension", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{1.0},{Infinity}} {getColumnDimension=1, getData=[[1.0], [Infinity]], getDataRef=[[1.0], [Infinity]], getDeterminant=!InvalidMatrixException, getNorm=Infinity, getRowDimension=2, getTra...#262#1241569533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "multiply", new String[]{"org.apache.commons.math.linear.BigMatrixImpl"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "scalarMultiply", new String[]{"java.math.BigDecimal"}, new String[]{"-1011428905656140431"}, false, 3, new String[][]{}), new String[][]{{"getColumnDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{{1},{-1}} {getColumnDimension=1, getData=[[1], [-1]], getDataAsDoubleArray=[[1.0], [-1.0]], getDataRef=[[1], [-1]], getDeterminant=!InvalidMatrixException, getNorm=2, getRoundingMode=4, ...#300#-1547776958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "subtract", new String[]{"org.apache.commons.math.linear.RealMatrix"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getLUMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "getDataRef", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.RealMatrixImpl", "preMultiply", "org.apache.commons.math.linear.RealMatrix", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "RealMatrixImpl{{0.0,0.0,0.0},{0.0,0.0,0.0}} {getColumnDimension=3, getData=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDataRef=[[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]], getDeterminant=!InvalidMatrixException, ge...#298#-150813712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.RealMatrixImpl", "org.apache.commons.math.linear.RealMatrixImpl", "scalarAdd", new String[]{"double"}, new String[]{"NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.BigMatrixImpl", "org.apache.commons.math.linear.BigMatrixImpl", "getScale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "BigMatrixImpl{} {getColumnDimension=!NullPointerException, getData=!NullPointerException, getDataAsDoubleArray=!NullPointerException, getDataRef=null, getDeterminant=!NullPointerException, getNorm=!Nu...#388#-427862652", SearchInputFactory_scaffolding.receiverState());
 }
}
