package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "32"}}, 3), new String[][]{{"next", "", "0"}, {"getCount", "int", "3"}, {"getCount", "", "2"}, {"getCounts", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483620"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[255, 256]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[12, 16, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[16]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[32, 64]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[0, 0, -1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2147483620"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-2, -10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 22, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"402128953"}, false, 16, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "1"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483620"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483620"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-51"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-51"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[0, -1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("379", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[8, 9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[16]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[100]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("990", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 9, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2"}, false, 9, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"9"}, false, 9, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-1073741824"}}), new String[][]{{"getCounts", "", "7"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}), new String[][]{{"getCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"26"}, false, 15, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-25"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 26]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"26"}, false, 16, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-25"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 26]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"47"}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 47]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2), new String[][]{{"getCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}), new String[][]{{"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1), new String[][]{{"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 1), new String[][]{{"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 1), new String[][]{{"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 1), new String[][]{{"getCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"getCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[100]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2, getSizes=[2]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[16]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 1), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[11, 12]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[8, 9]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"82"}, false, 12, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"82"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 2, 18]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1034"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 0, 10]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2068"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4, 0, 20]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"4136"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483620"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[8, 1, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2, getSizes=[2]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}), new String[][]{{"next", "", "3"}, {"hasNext", "", "6"}, {"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}), new String[][]{{"next", "", "3"}, {"hasNext", "", "6"}, {"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}), new String[][]{{"next", "", "3"}, {"hasNext", "", "6"}, {"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getCount", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "24"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2, getSizes=[2]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-29"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-29"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3), new String[][]{{"getCount", "", "4"}, {"hasNext", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3), new String[][]{{"getCount", "", "4"}, {"hasNext", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3), new String[][]{{"getCount", "", "4"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3), new String[][]{{"getCount", "", "4"}, {"hasNext", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3), new String[][]{{"getCount", "", "4"}, {"hasNext", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getCount", "", "4"}, {"hasNext", "", "0"}, {"next", "", "3"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getCount", "", "7"}, {"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "1"}}, 3), new String[][]{{"getCounts", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "1"}}, 3), new String[][]{{"getCounts", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "1"}}, 3), new String[][]{{"getCounts", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "10"}}, 2), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65280", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 1), new String[][]{{"next", "", "5"}, {"getCounts", "", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1669", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2), new String[][]{{"next", "", "1"}, {"hasNext", "", "7"}, {"getCounts", "", "0"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 2), new String[][]{{"next", "", "1"}, {"hasNext", "", "7"}, {"getCounts", "", "0"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-23"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}}, 1), new String[][]{{"next", "", "5"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=1000, getSizes=[1000]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1669", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2, getSizes=[2]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=5, getSizes=[5]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[100]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[16]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"10"}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"51"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1, 19]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"18"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"17"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"32"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 4, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"83"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 3, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[100]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=100, getSizes=[100]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"11"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[11]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"8"}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"64"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 1, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483624"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:5>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1669", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"10"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 8, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=7, getSizes=[7]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:9>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=10, getSizes=[10]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=16, getSizes=[16]}", SearchInputFactory_scaffolding.receiverState());
 }
}
