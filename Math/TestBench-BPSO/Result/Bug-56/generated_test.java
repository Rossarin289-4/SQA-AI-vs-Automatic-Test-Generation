package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[0, -1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}), new String[][]{{"next", "", "3"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "10"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}), new String[][]{{"getCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}), new String[][]{{"getCounts", "", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getCount", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}), new String[][]{{"getCounts", "", "7"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getCounts", "", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:3>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"33554434"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"next", "", "6"}, {"getCounts", "", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[0, -1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"hasNext", "", "2"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"536870922"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[0, -1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"51"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 6, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getCount", "int", "3"}, {"getCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[0, -1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "20"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2147483589"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483589]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}), new String[][]{{"next", "", "0"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}), new String[][]{{"next", "", "4"}, {"getCounts", "", "3"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.util.MultidimensionalCounter$Iterator", actual.getClass().getName());
  assertEquals("{getCount=-1, getCounts=[-1], hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getCounts", "", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[10]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:4>"}}, 2), new String[][]{{"next", "", "7"}, {"next", "", "5"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getCounts", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "37"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getDimension=0, getSize=0, getSizes=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1), new String[][]{{"hasNext", "", "0"}, {"getCount", "", "0"}, {"getCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3), new String[][]{{"getCounts", "", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 1), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:1>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:4>"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1073741824"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1073741824]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}}, 3), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "1073741823"}}, 2), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "7"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"54"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 2, 4]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"34"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 4, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "1073741823"}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3), new String[][]{{"getCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}, {"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"2"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3), new String[][]{{"getCounts", "", "0"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "33"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getDimension", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[2, 3]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "52"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("336", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSizes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getCounts", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCounts", new String[]{"int"}, new String[]{"30"}, false, 4, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1, 2, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=4, getSizes=[4]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "getSizes", ""}, {"org.apache.commons.math.util.MultidimensionalCounter", "getCount", "int[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getDimension", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.util.MultidimensionalCounter", "org.apache.commons.math.util.MultidimensionalCounter", "getCount", new String[]{"int[]"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math.util.MultidimensionalCounter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getDimension=1, getSize=2147483647, getSizes=[2147483647]}", SearchInputFactory_scaffolding.receiverState());
 }
}
