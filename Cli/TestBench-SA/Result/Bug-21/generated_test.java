package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "a"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "2147483648", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<empty>", "<empty>", "<empty>", " "}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:6>"}}, 2), new String[][]{{"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"\""}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1.5d"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:10>", "<i:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "0x1F", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:8>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:0>", "<s:a>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:1>", "<d:1.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-15", "<empty>", "<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}, {"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}}, 3), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"ensureCapacity", "int", "6"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:12>"}}, 1), new String[][]{{"process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "5"}, {"appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "2"}, {"isRequired", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"22", "<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:4>"}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:3>", "<null>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:0>", "<sample:2>", "<sample:1>", "1.1234567"}}, 1), new String[][]{{"listIterator", "", "4"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "i", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "1e10", "I"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:2>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "1"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:0>", "1E-5", "1.1234567890123456"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "+"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:9>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<b:true>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "abc", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{""}, false, 14, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.25", "<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:4>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:b>"}}), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[b, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<b:true>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", ";"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:11>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-1", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:12>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "00", "<i:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "1.255"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "a"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "a"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:7>", "Switch.already.set", "\""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:8>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:8>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a 0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample  a", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:9>", "<s:Mkey>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:9>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "-1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"++2+aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ""}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.csom/a?b=c", "#+1"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.csom/a?b=c", "#g+1"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:9>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x.5f", "Missinhh.pqfuioo"}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x.5f", "Missinhh.pqfuioo"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:7>", "g"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "true"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "true"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "false"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 10, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:7>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"dnvlk1L"}, false, 10, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:9>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:2>", "<empty>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"i", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"106", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:2>", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-536870892>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}, {"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "1L"}, {"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:1>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2147483647", "<empty>", "<empty>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>", "1-25"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:1>", "<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 49, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "10", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "Hello, World", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:1>", "<empty>"}, {"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:9>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:3>", "false"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:3>", "false"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:3>", "false"}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:4>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{",-1"}, false, 14, new String[][]{}, 2), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"a"}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"http://example.com/a?b=c", "<s:b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:b>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:0>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{" ", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:6>", "123456789012345678901234567890", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{" ", "<s:a>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:6>", "123456789012345678901234567890", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{" ", "<s:key>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:6>", "123456789012345678901234567890", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"  ", "<s:key>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:9>", "123456789012345678901234567890", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"  ", "<s:key>"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:9>", "123456789012345678901234567890", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:0>", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2147483647", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a 0 sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a 0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getTriggers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getTriggers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTriggers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getTriggers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-4>"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:1>", "<i:10>"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:0>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:6>", "<s:b>"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0xfFFhFFFFFinull"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "http://example.com/a?b=c", "1"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"+1", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1x.5f", "Missinh.pqfuioo"}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2xL5f|\"a\":1}", "Missinhh-pHello, World"}, false, 13, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.12345678901234567", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:7>", "\n"}});
  assertNull(actual);
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:7>", "\n"}});
  assertNull(actual);
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFFFFFF", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "", "+1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.5e300", "1"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:0>", "1.12345678"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.5e300", ""}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:0>", "1.12345678"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.5e300", "3"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:7>", "1.12345678"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.5e300", "3"}, false, 13, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:7>", "1.12345678"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.5e300", "3"}, false, 14, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:7>", "1.12345678"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"u1L"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:T>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-1", "<sample:3>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"57", "<empty>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:0>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:0>", "<sample:3>"}, {"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:9>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<sample:0>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:9>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483647", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2", "<empty>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:6>"}}), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"lastIndexOf", "java.lang.Object", "5"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "Switch.already.set"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5M0issinng.option2010-01-01", "JJ"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5N0issinng.option2010-01-01", "JJ"}, false, 8, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-N0issinng.opuion2010-01-00", "K"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "false"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "true"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:7>", "<empty>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:9>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:7>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:2>", "null", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2147483647", "<empty>", "<empty>"}});
  assertNull(actual);
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:3>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:8>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<empty>", "1.25"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:7>", "-0.0", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.25", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"a,b,c", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "|"}, {"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "iD", "1-1234567"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:5>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:8>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample  a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:8>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:3>", "false"}, false, 10, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:8>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1.5", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-M.5", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<null>", "true"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xfFFFFFFFinull<a>b</a>", "1.5Hello, World"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"010"}, false), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "-1.5"}}), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789012345678901234567890", "<s:sb>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sb", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789012345678901234567890", "<s:sb\t>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sb\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:>"}, false, 11, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1.5Tn3d//0"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=ca"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"c"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<i:26>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"c1E-5"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "\""}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<i:26>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"c1E-u"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "\""}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<i:26>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"c1"}, false, 15, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "12:30:45"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "\""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<i:26>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1.1234678:0123456"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1.2223366ta|"}, false, 10, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:2>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1..2224366ta|"}, false, 10, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:2>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:3>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "1125"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "Hello, World", "Title"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "\"", "#g+1"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "Hello, World", "Tiule"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "\"", "#g+1"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tiule", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "\t", "Tiule"}, false, 11, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "\"", "#g+1"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tiule", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\t", "Tiule"}, false, 11, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tiule", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\t1.25", "Tiule"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tiule", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\t1.25", "Tiul"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tiul", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\t1.25", "Tul"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tul", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "\t1l25", "(ul"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(ul", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "\t1l2", "(ul"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(ul", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "\t1l2", "(ul"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(ul", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "\t1l2", "1e10"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "true"}, false, 11, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:9>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:9>", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0x1F", "<s:key>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0x1F", "<s:key>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "2020-01-01-1.5"}}), new String[][]{{"getId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0x1F", "<s:key>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "2020-01-01-1.5"}}), new String[][]{{"getId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0x1F", "<s:key>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:8>", "2020-01-01-1.5"}}), new String[][]{{"getId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "0xFFFFFFFF", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:2>", "<sample:3>", "<sample:2>", "1.1235567890123456"}, {"org.apache.commons.cli2.option.GroupImpl", "getTriggers", ""}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:1>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}, {"listIterator", "", "0"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:3>"}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:1>", "<sample:1>", "<sample:2>", "1.1235567890123456"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "<sample:0>", "2120-01-01"}, false, 15, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "a b"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "TITLE"}, {"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "TITLE"}, {"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "TITLE"}, {"org.apache.commons.cli2.WriteableCommandLine", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:2>", "null"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:2>", "null"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:10>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:8>", "oull"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:14>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:7>", "oul_"}, false, 8, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:3>", "<sample:1>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:14>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:8>", "o"}, false, 8, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:5>", ""}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:5>", ""}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "ytrue"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:4>", "d"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "ytrue"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:4>", "d"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "1", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/a/b", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/a/b", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/a/b", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/a/b", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<null>", "0xfFFhFFFFFinull"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "/a/b", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:3>"}}, 3), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:8>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:8>", "2020-01-01", "-1"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:8>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:8>", "2020-01-01", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
}
