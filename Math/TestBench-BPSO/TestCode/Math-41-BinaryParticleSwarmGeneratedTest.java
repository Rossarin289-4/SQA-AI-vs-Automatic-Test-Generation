package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:2>", "<sample:2>", "-1", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:5>", "14", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<sample:2>", "10", "-2147483136", "true"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:3>", "<sample:0>", "1073741823", "134217729"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:4>"}}), new String[][]{{"incrementAll", "double[],int,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=2, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:4>", "<sample:1>", "-1.5"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<empty>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "2147483588", "10"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:1>", "<sample:3>", "1.0", "134217729", "-1"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:3>", "<null>", "1.7976931348623157E308", "14", "134213616"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "-27", "-268435458", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:3>", "-1048590", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:3>", "<empty>", "-268435458", "7"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"evaluate", "double[],double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "4", "10"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:0>", "<sample:1>", "7", "-1"}}, 2), new String[][]{{"incrementAll", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:8>", "<sample:0>", "-67108864", "2147483606"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<empty>", "<sample:2>", "1073741823", "1", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:4>", "134217719", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:0>", "1.0", "10", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:6>", "-67108864", "33554439"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:0>", "<sample:2>", "0", "-2147483647"}}, 2), new String[][]{{"evaluate", "double[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"setData", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:5>", "<sample:6>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:3>", "<sample:3>", "268435457", "524295"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:1>", "<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:0>", "2147483647", "-1"}}, 1), new String[][]{{"evaluate", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:3>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:1>", "<sample:1>", "-1.7976931348623157E308", "2147483647", "134217729"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "1.7000000000000002"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "-1", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:1>", "<sample:4>", "-1.0", "2", "-134217729"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:2>", "<sample:4>", "-2147483163", "2147483646"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:0>", "<sample:1>", "536870911", "-136314849"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"evaluate", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:7>", "<sample:3>", "Infinity"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:7>", "2147483647", "485"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:3>", "1073741823", "524295"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:5>", "28", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:5>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:8>", "<sample:1>", "0", "524295"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:0>", "1073741823", "1073745919"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:6>", "-0.952", "-2147483648", "41"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:1>", "1073745919", "10", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<empty>", "<sample:0>", "2147483647", "-2147483138", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:1>", "-2147483648", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<empty>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:1>", "Infinity", "1073741823", "-19"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"-9111962718267217978"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:5>", "-67108865", "-134217759", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}, 1), new String[][]{{"evaluate", "double[],double[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:4>", "31", "2147483647"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:5>", "<sample:4>", "Infinity"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "532551", "-27"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:4>", "<sample:1>", "-1", "-262147"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "0.9999999999999999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<empty>", "<sample:0>", "-1.055", "-1073741820", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:2>", "-2", "1073741823"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:3>", "2", "524295"}}, 1), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=?, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=?, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:5>", "Infinity"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "2147483647", "1073741823", "false"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<empty>", "-1.055"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"incrementAll", "double[]", "0"}, {"isBiasCorrected", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:0>", "<sample:0>", "-0.1052"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "262128", "1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:3>", "<empty>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:4>", "<sample:1>", "1.0000000000000002"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:3>", "536870955", "524295"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<d:3.0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:2>", "<sample:2>", "2147483647", "1"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:3>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "134217729", "0"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:1>", "-134217729", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<empty>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "-134217729", "2"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "-134217729", "-1"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:2>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:2>", "524295", "-134217729"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:1>", "<sample:2>", "1.7976931348623157E308", "46", "-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<null>", "4.9E-324"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "257", "55"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<empty>", "-1.055"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<empty>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:2>", "507911", "524295"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:10>", "<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:4>", "<sample:3>", "-1073741824", "2147483647", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "524261", "1073741823"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:1>", "Infinity", "134217746", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<sample:7>", "-2147483648", "0", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:2>", "<sample:3>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:0>", "<null>", "69", "7", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "2147483647", "134217729", "false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:2>", "<sample:7>", "-32763", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:2>", "<empty>", "-67108864", "2147483647", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false), new String[][]{{"evaluate", "double[],double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-5", "3"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:5>", "<sample:9>", "Infinity", "1", "134217729"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<null>", "-0.09999999999999999", "5", "-42"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:0>", "-5.0", "2147483646", "134217729"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<sample:2>", "0", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:5>", "<sample:11>", "0", "-24"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:5>", "<sample:2>", "NaN"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:1>", "<sample:1>", "0.0"}}), new String[][]{{"setData", "double[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "-1", "10"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "16370"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:5>", "<null>", "NaN"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setData", "double[]", "7"}, {"setData", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "2147483647", "14"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:0>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false), new String[][]{{"evaluate", "double[],double[],double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<sample:0>", "28", "-14", "false"}}), new String[][]{{"clear", "", "3"}, {"getData", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:4>", "0", "524295"}}), new String[][]{{"getResult", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:3>", "134217748", "-524295"}}), new String[][]{{"evaluate", "double[],double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "14", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:0>", "-1.8223925436534436E19", "21", "38"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:2>", "<sample:5>", "-2147483644", "-1"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<sample:0>"}}), new String[][]{{"evaluate", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "1048502", "7"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:4>", "<sample:4>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}), new String[][]{{"isBiasCorrected", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:4>", "Infinity", "0", "0"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:2>", "<sample:1>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:4>", "67371008", "0"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:5>", "-2147483648", "-2147483648"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "7", "-67108864", "true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<null>", "<sample:2>", "-1.055", "2147483646", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:2>", "-8192", "1879048191"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:3>", "NaN", "10", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<null>", "<sample:5>", "1073741738", "29"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<null>", "<sample:4>", "0.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "0", "-2147483648", "true"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<empty>", "65534", "10"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:4>", "<sample:4>", "-2147483134", "-2147483648", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:3>", "-16777209", "14"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:2>", "<sample:2>", "-2147483648", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<sample:4>", "14", "2147483647", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:6>", "134217682", "-2147483136"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:1>", "0", "14"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:0>", "<sample:1>", "1048484", "59"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "134217732"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:4>", "-2147483648", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1072694209", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:3>", "7", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6666666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:5>", "2147483610", "2147483647", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<null>", "<sample:1>", "-0.5275"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:2>", "28", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "NaN"}}), new String[][]{{"setData", "double[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=[0.0], getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getN=2, getResult=0.5, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:3>", "-1.7976931348623157E308", "5", "-2147483646"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:4>", "1074790399", "268435456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=1.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<empty>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:1>", "-54.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<null>", "<sample:7>", "-1073741824", "22"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:2>", "-1073741824", "67108864"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:3>", "<empty>", "2147483647", "-536870916"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\"a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:5>", "-2147483648", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<sample:1>", "<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:4>", "<sample:1>", "524295", "1073741568", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:3>"}}), new String[][]{{"isBiasCorrected", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getData", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "8.988465674311579E307"}}), new String[][]{{"isBiasCorrected", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getResult", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:1>", "56", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:1>", "<sample:4>", "2", "2147221503"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "19", "33554382"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=1.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{"org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=2, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:4>", "<null>", "2147483532", "7"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:3>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "-2.122"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double,int,int", "<sample:7>", "1.0", "-1", "-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:6>", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:5>"}}), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.stat.descriptive.moment.Variance", actual.getClass().getName());
  assertEquals("{getData=[-1.0, 0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "-30", "16777197"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "copy", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:3>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "28", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:1>", "-1073741824", "10"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double,int,int", "<sample:5>", "<sample:2>", "-8.988465674311579E307", "-1073741823", "524295"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:7>", "536870911", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:2>", "-2147483648", "134217758"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:3>", "14", "20", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:5>", "-2147483648", "16362"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=?, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<null>", "<sample:3>", "-24", "-7"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<null>", "-4094", "2097151"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "0", "-15"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:0>", "<sample:0>", "0.9999999999999999", "10", "7"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:7>", "<sample:1>", "0.0", "1073742081", "-2147483172"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:1>", "<empty>", "8", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<empty>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<null>", "2147483647", "2", "false"}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:8>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:3>", "<null>", "-9.1119627182672179E18", "11", "20"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:1>", "-2147483648", "22"}}, 3), new String[][]{{"evaluate", "double[],double[],double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:5>", "-5", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:3>", "<sample:3>", "1073741876", "-1140850687"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<null>", "<sample:3>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<empty>", "7", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "0", "0"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2131231681", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 3), new String[][]{{"setData", "double[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:5>", "Infinity", "2147483647", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "2147483091"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<sample:3>", "<sample:5>", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:0>", "<sample:3>", "1.7976931348623157E308"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<empty>", "-67108864", "-44", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "1", "65"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:3>", "0", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}}, 1), new String[][]{{"evaluate", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<empty>", "2147483647", "15", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-8388609", "-524327"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<empty>", "<sample:3>", "-134217729", "134217729"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "-2147483181"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:1>", "1610612735", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:5>", "536870911", "27", "false"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:2>", "-1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<sample:0>", "<sample:2>", "-2147483648", "1", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:2>", "<sample:4>", "14", "14"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", ""}}, 2), new String[][]{{"evaluate", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:6>", "<sample:1>", "36", "2147483146"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "524337", "66584575", "false"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:3>", "-134217672", "2147483646"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:1>", "1", "2146434560"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, 0.0, 1.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"-1.8223925436534436E19"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:3>", "<null>", "1048534", "-47"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getData", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:3>", "<null>", "1.0", "2017", "1073741790"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],double", "<null>", "<sample:4>", "-1.8223925436534437E20"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "setData", new String[]{"double[]", "int", "int"}, new String[]{"<null>", "262147", "1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<empty>", "0", "-2147483648", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:3>", "524296", "524287"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "clear", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double", "<sample:6>", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", new String[]{"double[]", "int", "int"}, new String[]{"<sample:8>", "1073741799", "-134217768"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int", "<sample:3>", "<sample:2>", "-1", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=3, getResult=Infinity, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:4>", "14", "2147483647"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:3>", "<sample:0>", "2147483647", "-3"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:0>", "-17", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:9>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-Infinity], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:4>", "31.0", "2147483647", "0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<null>", "<sample:1>", "4.9E-324", "1073741823", "2147483647"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "increment", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:3>", "14", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double", "int", "int"}, new String[]{"<sample:0>", "<sample:6>", "-1.0", "1073741823", "-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "int", "int"}, new String[]{"<sample:4>", "<null>", "14", "1048590"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],double[],int,int,boolean", "<empty>", "<sample:1>", "59", "-10", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:4>", "14", "2147483646", "false"}, false, 5, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[],int,int", "<sample:3>", "20", "8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "1.055"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "2.8"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<empty>", "0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "double[]", "int", "int", "boolean"}, new String[]{"<empty>", "<null>", "-524262", "7", "false"}, false, 4, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "-134217727", "28"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:5>", "14", "14"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],int,int", "<sample:1>", "28", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "-134217729", "2147483647"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<s:keWy{>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:2>", "2147483647", "134217721", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:4>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[],int,int", "<sample:2>", "<sample:1>", "1048590", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double", "int", "int"}, new String[]{"<sample:4>", "-1.0", "-32", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[]", "<sample:5>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<empty>", "-2147483648", "-2147483648", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:3>", "0", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<sample:2>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "incrementAll", "double[],int,int", "<sample:5>", "2147483182", "2147483647"}}, 2), new String[][]{{"clear", "", "1"}, {"evaluate", "double[],double[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "test", new String[]{"double[]", "int", "int", "boolean"}, new String[]{"<sample:5>", "0", "0", "false"}, false, 3, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int", "<sample:3>", "-2147483648", "2147483647"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", "double[],double[]", "<sample:7>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=null, getN=0, getResult=NaN, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "increment", "double", "3.5953862697246315E307"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "getN", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=null, getN=1, getResult=0.0, isBiasCorrected=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "evaluate", new String[]{"double[]", "double[]", "double"}, new String[]{"<sample:4>", "<sample:0>", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "equals", "java.lang.Object", "<d:15.0>"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "test", "double[],int,int,boolean", "<sample:4>", "-1073741510", "-2147483136", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.descriptive.moment.Variance", "org.apache.commons.math.stat.descriptive.moment.Variance", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.descriptive.moment.Variance", "setBiasCorrected", "boolean", "false"}, {"org.apache.commons.math.stat.descriptive.moment.Variance", "setData", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getN=0, getResult=NaN, isBiasCorrected=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
