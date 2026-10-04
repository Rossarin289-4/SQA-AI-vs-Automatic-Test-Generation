package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}), new String[][]{{"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"+l"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"{\"a!1}"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"{#a!1}"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false), new String[][]{{"getId", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1.5"}}), new String[][]{{"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[--|-1|-.|-5] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1.5"}}), new String[][]{{"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[0-|01|0.|05] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"helpLines", "int,java.util.Set,java.util.Comparator", "3"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1"}}, 1), new String[][]{{"helpLines", "int,java.util.Set,java.util.Comparator", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1"}}), new String[][]{{"helpLines", "int,java.util.Set,java.util.Comparator", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", ".1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-.|-1] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-.] {getDescription=null, getId=0, getPreferredName=-., isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[0.] {getDescription=null, getId=0, getPreferredName=0., isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-1|-.|-2|-5] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[01|0.|02|05] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-1|-.|-2|-5] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[01|0.|02|05] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "<a>b</a>"}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "010"}}, 2), new String[][]{{"getPreferredName", "", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[--|-1] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[0-|01] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1"}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1"}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2), new String[][]{{"getMaximum", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"findOption", "java.lang.String", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "+"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\t"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-\t] {getDescription=null, getId=0, getPreferredName=-\t, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.1234567{#a!1}"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.5f"}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1), new String[][]{{"withPattern", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}), new String[][]{{"reset", "", "7"}, {"create", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1L"}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"*1"}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "."}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "[1,2]"}}, 2), new String[][]{{"getTriggers", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[-,, -1, -2, -[, -]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "[1,2]"}}, 2), new String[][]{{"getTriggers", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[0,, 01, 02, 0[, 0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getTriggers", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getDescription", "", "6"}, {"getTriggers", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}), new String[][]{{"create", "", "6"}, {"getPreferredName", "", "7"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2), new String[][]{{"create", "", "6"}, {"getPreferredName", "", "7"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"1.5e300<a>b</a>"}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "I"}});
  assertNull(actual);
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\t\""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\u00e9"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\t\""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0xFFFFFF1FF"}}, 2), new String[][]{{"create", "", "7"}, {"findOption", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-0.0"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0x123456789"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0xFFFFFF1FF"}}, 2), new String[][]{{"create", "", "6"}, {"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0x123455789"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0xFFFFGF1FF"}}, 2), new String[][]{{"create", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"A#!c1}"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1), new String[][]{{"getPreferredName", "", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"create", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"withPattern", "java.lang.String", "3"}, {"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-s|-a|-m|-p|-l|-e] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}), new String[][]{{"create", "", "0"}, {"getMaximum", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}), new String[][]{{"create", "", "0"}, {"getMaximum", "", "1"}, {"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false), new String[][]{{"create", "", "4"}, {"getId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"create", "", "4"}, {"getId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"create", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"create", "", "0"}, {"getTriggers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "12:30:45"}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}), new String[][]{{"create", "", "0"}, {"getTriggers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"create", "", "6"}, {"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 52, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "A#!c2}"}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1), new String[][]{{"create", "", "6"}, {"getId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"withPattern", "java.lang.String", "5"}, {"create", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-a] {getDescription=null, getId=0, getPreferredName=-a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"withPattern", "java.lang.String", "5"}, {"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[0a] {getDescription=null, getId=0, getPreferredName=0a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "abc"}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"withPattern", "java.lang.String", "5"}, {"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-a] {getDescription=null, getId=0, getPreferredName=-a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "abc"}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"withPattern", "java.lang.String", "5"}, {"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[0a] {getDescription=null, getId=0, getPreferredName=0a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\037"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.5e300<a>b</`>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-\037|-1|-.|-5|-e|-3|-0|-a <arg>|-b <arg>|-` <arg>] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.5e3000<a>b</`>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-1|-.|-5|-e|-3|-0|-a <arg>|-b <arg>|-` <arg>] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\037"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.5e3000<a>b</`>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[0\037|01|0.|05|0e|03|00|0a <arg>|0b <arg>|0` <arg>] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getId", "", "1"}, {"getAnonymous", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 2), new String[][]{{"create", "", "0"}, {"appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "5"}, {"getPrefixes", "", "7"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"withPattern", "java.lang.String", "2"}, {"create", "", "1"}, {"getTriggers", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[-0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"withPattern", "java.lang.String", "2"}, {"create", "", "1"}, {"getTriggers", "", "6"}, {"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 3), new String[][]{{"create", "", "0"}, {"getId", "", "7"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"create", "", "0"}, {"getId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "+2"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "http://example.com/a?b=c"}}, 1), new String[][]{{"create", "", "3"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"@h!c1}}"}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"withPattern", "java.lang.String", "3"}, {"create", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[0s|0a|0m|0p|0l|0e] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"B%"}, false, 14, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}});
  assertNull(actual);
 }
}
