package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getDescription", "", "5"}, {"getDescription", "", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getPrefixes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"0.5e300+1"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"getTriggers", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "{\"a\"::1}0"}}, 2), new String[][]{{"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false), new String[][]{{"getMinimum", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"1.12345671.5"}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"0xx1F "}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "01I0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-0|-1|-I] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "12:30:45abc"}}), new String[][]{{"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false), new String[][]{{"appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "2"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false), new String[][]{{"getMinimum", "", "6"}, {"helpLines", "int,java.util.Set,java.util.Comparator", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "<a>b</3>"}}), new String[][]{{"isRequired", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 2), new String[][]{{"withPattern", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-a <arg>|-b <arg>] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}), new String[][]{{"getMaximum", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "*1"}}, 2), new String[][]{{"appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-1 [<arg1> [<arg2> ...]]] {getDescription=null, getId=0, getPreferredName=-1, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"getMinimum", "", "6"}, {"getAnonymous", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "<a>b</`>"}}, 2), new String[][]{{"findOption", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", ".50"}}, 2), new String[][]{{"getMinimum", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "12:30:45"}}, 2), new String[][]{{"getTriggers", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"withPattern", "java.lang.String", "1"}, {"create", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-a] {getDescription=null, getId=0, getPreferredName=-a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"{\"a\":;1}1"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.builder.PatternBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<la>b</>"}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "-1.4"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[--|-1|-.|-4] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "!"}});
  assertNull(actual);
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}), new String[][]{{"withPattern", "java.lang.String", "2"}, {"create", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[00] {getDescription=null, getId=0, getPreferredName=00, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 3), new String[][]{{"getMaximum", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "2147483"}}, 2), new String[][]{{"getMaximum", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"helpLines", "int,java.util.Set,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false), new String[][]{{"withPattern", "java.lang.String", "6"}, {"create", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-0] {getDescription=null, getId=0, getPreferredName=-0, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}), new String[][]{{"withPattern", "java.lang.String", "7"}, {"create", "", "4"}, {"appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-s|-a|-m|-p|-l|-e] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "bc"}}, 1), new String[][]{{"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"getAnonymous", "", "3"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false), new String[][]{{"create", "", "4"}, {"getId", "", "4"}, {"getDescription", "", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"-1.5{\"a\"::1}0"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}), new String[][]{{"create", "", "7"}, {"helpLines", "int,java.util.Set,java.util.Comparator", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0xx1Fh"}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"findOption", "java.lang.String", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.12345578"}}), new String[][]{{"create", "", "7"}, {"getPrefixes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getMaximum", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "010"}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 3), new String[][]{{"getTriggers", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.5e00"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-1|-.|-5|-e|-0] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "[1,2]"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-[|-1|-,|-2|-]] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"findOption", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 2), new String[][]{{"create", "", "0"}, {"getMinimum", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"create", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "T1.5f-1.5"}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 3), new String[][]{{"reset", "", "2"}, {"reset", "", "4"}, {"create", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "{#a\"::1}0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-{ <arg>|-a] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"withPattern", "java.lang.String", "5"}, {"create", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-a] {getDescription=null, getId=0, getPreferredName=-a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "0x1F"}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "<a>b/</3>!"}}, 2), new String[][]{{"getMinimum", "", "3"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2), new String[][]{{"create", "", "6"}, {"getPreferredName", "", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1), new String[][]{{"withPattern", "java.lang.String", "3"}, {"create", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-s|-a|-m|-p|-l|-e] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "`,l,c"}}, 3), new String[][]{{"create", "", "0"}, {"getPrefixes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"withPattern", "java.lang.String", "6"}, {"create", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-0] {getDescription=null, getId=0, getPreferredName=-0, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 3), new String[][]{{"create", "", "2"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"create", "", "1"}, {"getId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 2), new String[][]{{"create", "", "0"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "1.5e3002147483648!"}}, 1), new String[][]{{"create", "", "0"}, {"getAnonymous", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "/a.b<a>b</3>"}}, 3), new String[][]{{"create", "", "6"}, {"helpLines", "int,java.util.Set,java.util.Comparator", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"create", "", "1"}, {"findOption", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "withPattern", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "reset", ""}}, 1), new String[][]{{"create", "", "2"}, {"isRequired", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 1), new String[][]{{"withPattern", "java.lang.String", "5"}, {"create", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-a] {getDescription=null, getId=0, getPreferredName=-a, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "\n<a>b</3>"}}, 2), new String[][]{{"create", "", "3"}, {"getPrefixes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"withPattern", "java.lang.String", "6"}, {"create", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.DefaultOption", actual.getClass().getName());
  assertEquals("[-0] {getDescription=null, getId=0, getPreferredName=-0, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "create", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "withPattern", "java.lang.String", "h-tp://example.com/a@b=c"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli2.option.GroupImpl", actual.getClass().getName());
  assertEquals("[-h|--|-t|-p <arg>|-e|-x|-a|-m|-l|-.|-c|-o|-b|-=] {getDescription=null, getId=0, getMaximum=2147483647, getMinimum=0, getPreferredName=null, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.builder.PatternBuilder", "org.apache.commons.cli2.builder.PatternBuilder", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}, {"org.apache.commons.cli2.builder.PatternBuilder", "create", ""}}, 3), new String[][]{{"create", "", "3"}, {"getAnonymous", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
