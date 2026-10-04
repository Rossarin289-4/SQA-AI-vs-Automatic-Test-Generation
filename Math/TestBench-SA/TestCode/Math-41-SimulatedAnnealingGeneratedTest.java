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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<empty>", "-9111962718267217978"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "<null>", "-1", "2147483647", "true"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:0>", "-6.0"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:3>", "-1", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.25, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:56>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:1>", "-Infinity"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:4>", "<sample:1>", "8.988465674311579E307"}, false, 15, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "Infinity", "0", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:0>", "<sample:0>", "1.8223925436534434E19"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "-1.0"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:4>", "<sample:1>"}}, 3), new String[][]{{"evaluate", "double[]", "6"}, {"increment", "double", "0"}, {"clear", "", "0"}, {"evaluate", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "Infinity"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<null>", "0", "10", "false"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<sample:1>", "-1.0", "0", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "-1073741824", "10", "true"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<null>", "<null>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:0>", "<sample:1>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:0>", "<sample:0>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "-1", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "1.0", "-2147483648", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "-2147483647", "5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "1.0", "-2147483648", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "0", "5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "1.0", "-2147483648", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "1073741823"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:2>", "<null>", "-1.7976931348623157E308"}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<empty>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:2>", "<null>", "-1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:1>", "<empty>", "-1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "-1.7976931348623158E307", "2147483647", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:0>", "10", "10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<empty>", "<sample:0>", "2147483647", "10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:0>", "2147483640", "10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:1>", "<sample:1>", "-2147483648", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:1>", "<empty>", "-2147483648", "-1073741824"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "-2147483648", "-1073741865", "true"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "1", "0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:1>", "2147483647", "-1073741824"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<null>", "<sample:2>", "Infinity", "5", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<null>", "<null>", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "1", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "NaN", "1", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "NaN", "1", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "NaN", "1", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "NaN"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1089993791", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072694209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<null>", "1", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<null>", "1", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<null>", "1", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:1>", "<sample:2>", "52", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"evaluate", "double[],double[],double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:0>", "<null>", "1", "5", "true"}}, 3), new String[][]{{"evaluate", "double[],double[],double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:1>", "-1", "5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<sample:0>", "-1073741824", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<sample:0>", "-1073741824", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:2>", "<sample:0>", "-1073741824", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "10"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<null>", "<sample:1>", "2147483647", "1073741311", "true"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<empty>", "<sample:1>", "0", "1073741311", "true"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Iikey>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "-14", "20"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:2>", "<null>", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ur>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:0>", "-1073741824", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:1>", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "Infinity"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "-2147483648", "1"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "-1.7976931348623157E308", "1", "-2147483648"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<empty>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "-2147483648", "1"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "-1.7976931348623157E308", "1", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "-1.7976931348623157E308", "1", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<null>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "-1.7976931348623157E308", "1", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "0", "10", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<sample:1>", "-1.0", "0", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<null>", "0", "10", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<sample:1>", "-1.0", "0", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<null>", "0", "10", "false"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<sample:1>", "-1.0", "0", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<null>", "<null>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<empty>", "<sample:2>", "-1", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<empty>", "<sample:2>", "-1", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:1>", "<sample:2>", "5", "-2147483648", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "-1", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "1.0", "-2147483648", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:2>", "<null>", "-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:1>", "-1.7976931348623158E307"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<empty>", "<empty>", "-1.7976931348623155E307"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-1", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<null>", "1.0", "-1073741824", "5"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<null>", "1.0", "-1073741824", "5"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<null>", "1.0", "-1073741824", "5"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<null>", "1.0", "-1073741824", "5"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<null>", "<sample:2>", "-1073741824", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<empty>", "<sample:1>", "2147483647", "2147483647", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:0>", "10", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:1>", "NaN", "-1", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "-2147483648", "-1073741824", "true"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "1", "5"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<sample:0>", "-1", "-1073741824", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "1", "0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:1>", "2147483647", "-1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<null>", "<sample:0>", "10", "5", "true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<null>", "<null>", "1.7976931348623157E308", "1", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"NaN"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<empty>", "<null>", "1.7976931348623157E308", "1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "0", "10"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "0", "-1"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "1.9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "0", "10"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<null>", "<null>", "-2147483648", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:1>", "2147483647", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:0>", "-2147483648", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "<null>", "2147483647", "-1073741824", "true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=1.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<empty>", "-2147483520", "5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<empty>", "<sample:1>", "1", "-1073741824"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<null>", "<empty>", "1.7976931348623157E308", "2147483647", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "1", "0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<null>", "<sample:0>", "2147483647", "-2147483648", "true"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "1073741857"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "1073741857"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "5", "1073741857"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:0>", "1.7976931348623157E308", "-2147483648", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:2>", "<null>", "0", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:5>", "<sample:2>", "0", "2143289283"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "48.925"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<empty>", "10", "1", "true"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:2>", "-1", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<null>", "0.0", "-1073741824", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<null>", "NaN", "1", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:1>", "<sample:0>", "2147483647", "2147483647", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<null>", "<empty>", "1", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:2>", "NaN", "-2147483648", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:0>", "0", "-1069547535"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:2>", "-1073741824", "0"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<empty>", "<sample:1>", "1.7976931348623157E308", "2147483647", "1"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65010751", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<empty>", "-1", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<empty>", "-1", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<null>", "<sample:0>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"evaluate", "double[],double[],double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:1>", "<null>", "0.0", "-1073741824", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:5>", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:0>", "<sample:1>", "5", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "10"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "1073741857", "1073741857"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "1073741857", "1073741857"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "-1", "-1", "false"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "-1", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "-1", "49", "false"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:0>", "-1", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:2>", "1073741857", "5"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "5", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Iikey>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "-14", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ur>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ur>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "-1.7976931348623158E307"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<null>", "<null>", "NaN", "2147483647", "1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:1>", "<sample:2>", "0", "1", "true"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<null>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"evaluate", "double[]", "6"}, {"getN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}), new String[][]{{"evaluate", "double[]", "6"}, {"getN", "", "2"}, {"evaluate", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:1>", "<sample:1>", "-9111962718267217978", "10", "1073741857"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:1>", "<sample:1>", "-9111962718267217978", "2147483647", "1073741857"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:2>", "<sample:1>", "-24.000000000000004", "-2147483646", "10"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<null>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:1>", "<sample:1>", "-24.000000000000004", "-2147483646", "20"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<null>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}}), new String[][]{{"evaluate", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:5>", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "-799.5500000000001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:2>", "1073741855", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000002328306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "-799.5500000000001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:2>", "1073741855", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000002328306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<null>", "-799.5500000000001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:2>", "1073741855", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:0>", "<empty>", "-2147483648", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "1.7976931348623157E308"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:0>", "-1.7976931348623157E308"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:0>", "<sample:2>", "1.0", "2147483647", "1073741857"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:0>", "-Infinity"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:1>", "<sample:2>", "1.0", "2147483647", "1073741857"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "<empty>", "-1", "5", "true"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:2>", "<empty>", "-2147483648", "1073741857"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<null>", "<sample:3>", "2147483647", "1073741857"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<empty>", "<null>", "535822363", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:2>", "<empty>", "-2147483648", "-1"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<empty>", "<sample:2>", "535822363", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:2>", "<empty>", "-2147483648", "-1"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "-1073741824", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "true"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:1>", "-2147483648", "1073741857"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:2>", "-1073741824", "-2147483648"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:1>", "<empty>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"9.739999999999997"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<empty>", "-1", "1073741857"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:1>", "5", "5"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<null>", "1073741857", "10", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<empty>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<empty>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "1", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 3), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 3), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<null>"}}, 3), new String[][]{{"evaluate", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "2147483647", "5", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:4>", "<sample:1>", "1.8223925436534434E19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:2>", "<sample:1>", "NaN"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:4>", "<sample:1>", "-1.8223925436534434E19"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "1.0", "-2147483648", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:2>", "<sample:1>", "NaN"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:4>", "<sample:1>", "NaN"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "1.0", "-2147483648", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<null>", "<sample:1>", "NaN", "0", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<null>", "<sample:4>", "NaN", "0", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "1073741857", "5", "false"}, false, 9, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:4>", "1", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "0.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:7>", "0", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<empty>", "<empty>", "1073741857", "2147483647", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:4>", "<null>", "-1073741780", "10", "true"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:0>", "<sample:4>", "-1073741824", "5", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:0>", "<sample:4>", "-1073741824", "5", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:0>", "<null>", "-1.0", "2147483612", "5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"7.2895701746137735E19"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false), new String[][]{{"getData", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false), new String[][]{{"getData", "", "0"}, {"evaluate", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getData", "", "0"}, {"evaluate", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6666666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:4>", "5", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:1>", "<sample:0>", "0.0"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:4>", "2147483647", "2147483647"}}, 3), new String[][]{{"getData", "", "3"}, {"evaluate", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6666666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:4>", "5", "-1073741824"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:1>", "<sample:0>", "0.0"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:4>", "2147483647", "2147483647"}}, 3), new String[][]{{"getData", "", "3"}, {"evaluate", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:1>", "<sample:0>", "0.0"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:4>", "2147483647", "2147483647"}}, 2), new String[][]{{"getData", "", "5"}, {"evaluate", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:4>", "10", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:1>", "<sample:4>", "-33", "-2147483648", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:1>", "<sample:4>", "-33", "-2147483648", "true"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<null>", "5", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:1>", "0", "10"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "1", "0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "1", "0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:1>", "<empty>", "NaN"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<null>", "0", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<null>", "0", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "1073741856", "-2"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "-536870850", "2147483647"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:2>", "-1073741812", "-1"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "-9.1119627182672179E18"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<sample:4>", "0", "1"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<empty>", "<sample:1>", "0", "1", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<empty>", "<sample:1>", "0", "1", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<empty>", "<sample:1>", "0", "1", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<null>", "<null>", "-2147483648", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<null>", "<null>", "-2147483648", "-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:0>", "1", "10"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<null>", "<null>", "-2147483648", "-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:0>", "1", "10"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<null>", "<null>", "-2147483648", "-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:0>", "1", "10"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<null>", "<null>", "-2147483648", "-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:0>", "1", "-1048566"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:1>", "<sample:0>", "1", "-1048566"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
