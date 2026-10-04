package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<null>"}, false, 13, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", ".5"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "-0.0", "/a/b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "processValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator", "org.apache.commons.cli2.Option"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:5>", "0"}, {"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:5>", "<sample:3>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "findOption", "java.lang.String", "\010"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "-0.0r", "<i:2>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "0eh10", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 41, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"m.12i456789123456"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:b>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:6>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "Hello, World", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\"\""}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\"\"null"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getId", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "getId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"null", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:5>", "false"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "Switch.already.set"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "false"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<sample:2>"}}), new String[][]{{"isEmpty", "", "0"}, {"ensureCapacity", "int", "5"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1073741856", "<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine,org.apache.commons.cli2.Option", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:3>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:1>"}}, 1), new String[][]{{"iterator", "", "0"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<sample:3>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[<01> [<02>]] {getConsumeRemaining=a, getDescription=sample, getId=8, getInitialSeparator=a, getMaximum=2, getMinimum=-10, getPreferredName=0, getSubsequentSeparator=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<empty>", "<sample:3>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine,org.apache.commons.cli2.Option", "<sample:5>", "<sample:3>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getValidator", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", "org.apache.commons.cli2.WriteableCommandLine,org.apache.commons.cli2.Option", "<sample:7>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Switch.already.set", "m.12i456789123456"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:3>", "2020.01-01"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<sample:0>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1346517445", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"Shtch.a.lreandy.set-1.5"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", ";a>b<9/a>", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "--"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "2020-01-01"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "2020-01-02"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:6>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:6>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:6>", "<null>"}}, 3), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "processValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator", "org.apache.commons.cli2.Option"}, new String[]{"<sample:4>", "<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:7>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:1>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:5>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "-1arg"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:7>", "<i:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "1.12345678901234567", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<i:0>"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:5>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", " ...", "true"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "--1", ",b,c4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<i:0>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", " ...", "true"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "--1", ",b,c4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", " ...", "true"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "--1", ",b,c4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<null>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:4>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "2"}, {"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:2>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:2>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:6>", "<i:-1>"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:5>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:7>", "<i:0>"}, false, 10, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<i:-1129>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483646", "<sample:1>", "<empty>"}, false, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "2"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483600", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{}, 1), new String[][]{{"contains", "java.lang.Object", "2"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "[1,2]"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:0>", "\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:3>", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:0>", "1L"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<null>", "00"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"012"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0136"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"i1.E5sd1.5"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i1.E5sd1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:76>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "2020-01-01", "1f10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:76>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "2020-01-01", "1f10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<i:-304>"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "1.5d"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", ".5", "1e10"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "2020-01-01", "1f10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:3>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:3>", "<empty>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:3>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"isEmpty", "", "1"}, {"containsAll", "java.util.Collection", "5"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Switch.already.set", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.123456789123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Switch.already.set", "m.12i456789123456"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Switch.already.set", "m.12i456789123456"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:6>", "2020-01-01"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<sample:0>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "<a>b</a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18098180", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1346517445", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"arg", "1.5"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"Switch.already.set"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "Title"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "m.12i456789123456", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "TITLE"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.cli2.option.ArgumentImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<null>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "[1,2]0x1F"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "[1,2]0x1F"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "--"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:1>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.123d45678"}, false, 9, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:7>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:3>", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:6>", "<sample:0>", "<null>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-2147483648", "<empty>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:6>", "<sample:0>", "<null>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-2147483648", "<empty>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:7>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getValidator", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:6>", "<sample:0>", "<null>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-2147483648", "<empty>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:8>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:8>", "<sample:0>", "<null>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-2147483648", "<empty>", "<null>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:6>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-2147483648", "<sample:3>", "<empty>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:3>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", ""}}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"1.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"1.35"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.35", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\u00e9E"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9E", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\u00e9FE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9FE", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\u00e9FE"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9FE", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\u00e9F"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9F", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"010"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"011"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("011", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"01"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", ".5"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", ".5"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "-0.0", "/a/b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<null>"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "."}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "-\u00e9.0", "/a0b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:6>", "<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<i:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", " ...", "true"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "--1", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 15, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 15, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "2"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "0x1F"}}), new String[][]{{"size", "", "6"}, {"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<null>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "Switch.already.set", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "Switch.already.set", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "Switch.already.set", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "true"}, false, 11, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "Switch.already.set", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a 0 sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:5>", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:7>", "<s:bs>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bs", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<s:bs>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bs", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<s:bt>"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bt", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:5>", "<s:>"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<s:+>"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "2"}, {"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "\u00e9", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:0>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:3>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:5>"}}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"isEmpty", "", "6"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483646", "<sample:1>", "<empty>"}, false), new String[][]{{"contains", "java.lang.Object", "2"}, {"lastIndexOf", "java.lang.Object", "5"}, {"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483646", "<sample:1>", "<empty>"}, false), new String[][]{{"contains", "java.lang.Object", "2"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "processValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator", "org.apache.commons.cli2.Option"}, new String[]{"<sample:8>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:4>", "<sample:0>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "getValidator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:5>", "<s:X>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:0>", "1L"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<null>", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:10>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "a,b,c", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.1234[5678a,b,c"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "1"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0.1234[5678ab,c"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "1"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"01234[56t788ab,c"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:3>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<i:-1>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"5"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:0>", "<i:2>"}}, 3), new String[][]{{"isEmpty", "", "1"}, {"containsAll", "java.util.Collection", "5"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", " ", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"10", "<empty>", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:5>", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[<01> [<02>]] {getConsumeRemaining=a, getDescription=sample, getId=8, getInitialSeparator=a, getMaximum=2, getMinimum=-10, getPreferredName=0, getSubsequentSeparator=0, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:10>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:10>", "false"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:0>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:0>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "true", "{\"a\":1}"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "true", "{\"a\":1}"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1.1234567890123456", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/a/b", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1.1234567890123456", "false"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/aa/b", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Switch.already.set"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1.1234567890123456", "false"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/aa/b", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Switch.already.set"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1.12345678901234561.5", "true"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/aa/b", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Switch.already.set"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1.12345678901234561.5", "true"}, false, 9, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/aa/b", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Switcg.already.set"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1.1234578901234561.5{\"a\":1}", "true"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/aa/b", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Switcg.already.seu"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"[1,2]0x1F"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:0>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "1e10"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "1.1234567", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-1", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-1", "<sample:0>", "<sample:1>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-1", "<sample:0>", "<sample:1>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-1", "<sample:0>", "<sample:1>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
