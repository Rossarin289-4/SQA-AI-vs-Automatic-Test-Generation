package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getParent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:4>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-2147483648", "<sample:3>", "<null>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:2>", "<sample:6>", "<null>", "1e10{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:2>", "<null>"}}), new String[][]{{"clear", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "aaaaaaa`aaaaabaaaaaaaaaaaaaaaa", "Switch.already.set"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"trSue", "0"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "1e2:30:45abc", "1.1234567890123456"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<i:-961>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:3>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:4>", "<i:173>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-961", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:8>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"0T123356789/a/b"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:4>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "http:://example.com/a?b=c", "1Ed5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"00.5f"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "http://example.com/a?b=c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:11>"}});
  assertNull(actual);
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789012345678901234567890", "<i:63>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:1>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "setParent", "org.apache.commons.cli2.Option", "<sample:9>"}, {"org.apache.commons.cli2.option.OptionImpl", "checkPrefixes", "java.util.Set", "<sample:7>"}}, 3), new String[][]{{"getPreferredName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:3>", "<sample:6>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{":/a/b", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:>"}}), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"TBITLH"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "\037"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1", "<i:26>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "findOption", "java.lang.String", "t.5fT"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:1>"}, {"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:2>", "<empty>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<null>", " "}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "1234567890:2345678901234567890", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:0>"}}, 1), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"22", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getTriggers", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:4>", "1.023a567"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:3>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a1> [<a2> ...]", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:1>", "<empty>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getParent", ""}, {"org.apache.commons.cli2.option.OptionImpl", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:1>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0T123456789/a/b"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.cli2.Option", "getDescription", ""}}, 2), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"bb\nc", "2020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "Unexpected.tokem1E-5", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:6>", "0x1FUnexpected.token"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "!"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli2.Option", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:5>", "2147483648true", "("}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "getParent", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:2>", "1.12345678"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:4>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:1>", "TITLEa"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "isRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "findOption", "java.lang.String", "b"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"x"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:3>"}, {"org.apache.commons.cli2.Option", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "1.12345678a b"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "."}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:9>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-8191", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:1>"}}, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "01/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getDescription", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:2>", "1.12345678901234561.25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"2020-02-30T25:61:61", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getPrefixes", ""}, {"org.apache.commons.cli2.Option", "findOption", "java.lang.String", "Rtea b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1LSwitch.already.set"}}, 1), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:0>", "<sample:5>", "<sample:3>", "1e10"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "isRequired", ""}, {"org.apache.commons.cli2.option.OptionImpl", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "Unexpected.tokena,b,c", "bbc"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bbc", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:2>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.Option", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli2.option.OptionImpl", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<sample1> <sample2> [<sample3>]", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getParent", ""}}, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1e10", "0T123456789/a/b"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0T123456789/a/b", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"Titlea b"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"10", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "getId", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:7>", " (i"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "trud"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "checkPrefixes", "java.util.Set", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<null>", "true"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<null>", "0PT1H"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"Z12]"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<empty>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "Ttea b"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtea b2147483648", "1e100-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e100-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"2020-02-30T25:61:61", "<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:5>", "<i:64>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:5>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"rd"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:8>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-D1", "#"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:0>", "1020-01-01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:3>", "false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:3>", "1.1234567890123456+1"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:9>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234567890", "<b:true>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:2>", "hx", "#"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getParent", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<i:49>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "1Ed5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "bbc"}});
  assertNull(actual);
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1K<a>b</a>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "toString", ""}, {"org.apache.commons.cli2.option.OptionImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:8>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-40", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "setParent", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.Option", "getDescription", ""}}), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli2.Option", "isRequired", ""}, {"org.apache.commons.cli2.Option", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:63>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "findOption", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:8>", "<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2038", "<sample:0>", "<sample:2>"}, false), new String[][]{{"size", "", "7"}, {"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "1abc", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"2010-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}, {"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<d:53.552>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"Switch.already-set"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"\nPT1H"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.531>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"+1", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "/a/4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:3>", "<sample:1>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.Option", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<empty>", "<null>", "<empty>"}, {"org.apache.commons.cli2.Option", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "--k", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli2.Option", "getParent", ""}, {"org.apache.commons.cli2.Option", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:1>", "<sample:6>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a1> [<a2> ...]", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2147483647", "<sample:6>", "<null>"}});
  assertNull(actual);
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:1>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:10>", "<empty>"}, {"org.apache.commons.cli2.option.OptionImpl", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "2020_01-01"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "-15", "1Ed5a"}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:4>", "{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:3>", "<sample:5>"}, {"org.apache.commons.cli2.option.OptionImpl", "findOption", "java.lang.String", "0--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "getId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "TITLdE", "0010"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "1e10|\"a!:1}"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "0Ed:"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"UnexpectHed.token", "<sample:4>"}, false), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "Title"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:1>", "", "  "}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:3>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:5>", "<sample:0>", "<sample:0>", " (a bb"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18098180", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:4>", " '("}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0.12345678", "<i:49>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.Option", "getId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "4"}, {"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:1>", "babl"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:6>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"T"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"nulll1", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getDescription", ""}, {"org.apache.commons.cli2.Option", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:3>", "<empty>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"61", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "checkPrefixes", "java.util.Set", "<sample:4>"}}), new String[][]{{"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}}), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<null>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "Titlea U"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:4>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "equals", "java.lang.Object", "<d:64.5>"}}), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.Option", "findOption", "java.lang.String", "|"}, {"org.apache.commons.cli2.Option", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:4>", "<sample:0>"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:7>", "1", "12:330:45Titlea b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"\nP"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:2>", "2147483648a", "PT/H"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\n\n", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "UnexpectedS.token"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "findOption", "java.lang.String", "rUc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "0"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:12>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "i"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "Tntle1.1234567", "5.1.1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.Option", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:5>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:1>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:5>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "0x123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "SITE"}}), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:3>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getParent", ""}, {"org.apache.commons.cli2.option.OptionImpl", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "2.5e3001.12345678901234567", "1e10{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"3*1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "true"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:8>", "\t"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"21o7483648", "true"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "0", ".5a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:6>"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"0b1F"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "helpLines", "int,java.util.Set,java.util.Comparator", "41", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "getDescription", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "1EdL"}}), new String[][]{{"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"61", "<null>", "<sample:3>"}, false), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<i:24>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "1E-55.", "1LPT1H123456789012345678901234567890"}}), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1.5", "<sample:0>"}, false), new String[][]{{"remove", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "getParent", ""}, {"org.apache.commons.cli2.Option", "findOption", "java.lang.String", "\""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:3>", "g.5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0x123456789", "-15"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:7>", " 0", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "isRequired", ""}}), new String[][]{{"iterator", "", "3"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-1", "<empty>", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.OptionImpl", "findOption", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.Option", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"111L", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "1e10{"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"1e10{\"a\":1}"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"Hello, World+1", "true"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:2>", "bTabl"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.OptionImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.Option", "findOption", "java.lang.String", "1Lr"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{" i.5"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "1.5"}}), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "adc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "f", "1.1234567801234567"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567801234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "", "1e0-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e0-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:7>", "2020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-60", "<sample:6>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:3>"}}), new String[][]{{"trimToSize", "", "5"}, {"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<null>"}}), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345678901234567", "<s:t>"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "1e10"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.Option", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:3>", ""}, false, 6, new String[][]{{"org.apache.commons.cli2.Option", "setParent", "org.apache.commons.cli2.Option", "<sample:9>"}, {"org.apache.commons.cli2.Option", "getId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "/a/b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:6>"}}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:10>", "<d:31.5>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("31.5", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a ", "1.5"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:0>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1."}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "U1E-k"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"null"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:1>", "0.5", "ai,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"2147483648", "<d:0.75>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
}
