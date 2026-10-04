package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<sample:3>", "PT1H"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<null>", "<sample:2>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "a b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:0>", "<sample:1>", "<sample:4>"}, {"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<empty>", "<sample:3>", "<sample:3>", "abc"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "10", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<empty>", "<sample:4>", "<sample:1>", "abc1.5d"}, false, 14, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getId", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:7>", "123456789012345678901234567890"}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "10", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"10", "<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-29", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:5>", "1.1234567"}}), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<sample:1>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"size", "", "2"}, {"listIterator", "", "6"}, {"set", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 11, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:4>"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<null>", "010"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "[1,2]"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<null>", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "10", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "10", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<empty>", "<sample:3>", "<empty>"}, {"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:3>", "<empty>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-1", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-1", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<empty>", "<sample:3>", "<sample:3>", "i"}, {"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:2>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:2>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "0", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<null>", "<sample:0>", "<null>", "-0.0"}, {"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "a,b,c"}, {"org.apache.commons.cli2.option.GroupImpl", "getTriggers", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:0>", "TITLE"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}, {"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<sample:4>", "<empty>"}, false), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<sample:2>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483607", "<sample:4>", "<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:6>"}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:5>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<null>", "I"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:3>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:4>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<null>", "<sample:3>", "<empty>"}}, 3), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:3>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:2>", "<sample:3>", "<empty>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:1>", "<sample:0>", "<empty>"}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:6>", "<null>"}}, 1), new String[][]{{"iterator", "", "7"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<empty>", "<sample:1>", "<sample:2>", "12:30:45"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<sample:2>", "1.12345678"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:2>"}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:1>", "<sample:3>"}, false, 2, new String[][]{}, 2), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:0>", ".PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "1", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "1", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-4095", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-4095", "<sample:3>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-4095", "<sample:3>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:2>", "<null>"}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:5>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:3>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<empty>", "<sample:3>", "<sample:3>", "1..http://example.com/a?b=c"}, false, 8, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:2>", "<null>", "<sample:0>", "//b"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:6>", "1.5f"}, false, 8, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getId", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getTriggers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"aaaaaa2aaaaaaaaaaaaaaaaaaa:aaT"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-1048582", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<null>", "<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<null>", "<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:2>", "1.5d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<empty>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:1>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}}), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"5..00xgFFFFFEF"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"10", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<empty>"}, {"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}}), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<null>", "<null>"}});
  assertNull(actual);
 }
 public void testGeneratedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "10", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<sample:4>", "<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<null>", "<sample:0>"}}, 2), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<null>", "<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}, {"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:1>"}}, 1), new String[][]{{"add", "java.lang.Object", "7"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"10", "<sample:2>", "<sample:3>"}, false), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<null>", "<sample:0>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1073741823", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<empty>", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:6>", "<sample:1>"}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:6>"}}, 2), new String[][]{{"clone", "", "4"}, {"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"0", "<sample:0>", "<null>"}, false, 0, null, 3), new String[][]{{"remove", "java.lang.Object", "2"}, {"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2097209", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2080790", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "2"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:3>", "<sample:1>", "<null>", "abc1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:3>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:3>", "<sample:2>", "<null>", "PT1H1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<empty>"}, {"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:6>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:1>", "<sample:1>", "<sample:2>", "http://example.coE/a?b=c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 2), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-1", "<sample:3>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}, 2), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483644", "<sample:4>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-49", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<i:1>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 11, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<null>", " ("}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "0xFFFFFFFF"}}, 3), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:2>"}, {"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<null>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:11>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
