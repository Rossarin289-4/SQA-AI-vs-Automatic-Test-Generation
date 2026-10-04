package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:7>", "--1"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"00"}, false, 7, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "0x123456789", "--2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:4>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "<null"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "a,b+6b"}}), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "a b"}, {"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"PT0H"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "s(", "1.5"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "<null"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "a,b+6b", "Twitc"}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Missing.option"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}, {"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:1>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"Missing.otion--1"}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-41", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:4>", "<sample:3>", "<sample:0>"}}), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Switch.alrreadys+et|", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "-1/55"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:1>", "<sample:3>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "true"}}, 2), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", " TITLEE", "Hello- World"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0xFFFFFFFG", "<d:3.0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:9>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}, 2), new String[][]{{"contains", "java.lang.Object", "1"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:F>"}}), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:ke>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "217-4-p83648", "<sample:1>"}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "\"", "Switch.already.set"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "1147-4-p83648"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:0>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Switch.already.set", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<s:ke>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:C+k>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "1.1T234567890123A567", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"/5e300"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<null>", "<empty>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:7>", "<s:+kb>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+kb", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"Hello- World"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:2>", "Switch.alrready.set|"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:2>", "|"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"-1.55"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "+1", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "\n+", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:3>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<i:22>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:12>", "-1.5", "\u00e9"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getAnonymous", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}, {"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:2>", "<null>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:6>", "T1"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"0U0"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5", "Switch.alrready.set|"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "java.lang.String", "-41.55"}}, 3), new String[][]{{"listIterator", "int", "2"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:7>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:2>", "<empty>", "<sample:3>", "0x123456789"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0.5d"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "0", "PT01H"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aII b", "0x1F"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:6>", "<sample:2>", "<null>", "ab,/"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:5>"}, {"org.apache.commons.cli2.option.GroupImpl", "getTriggers", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:1>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:7>", "true"}}, 1), new String[][]{{"helpLines", "int,java.util.Set,java.util.Comparator", "5"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<empty>", "<sample:1>", "<sample:1>", "a,b+c"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getTriggers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"I/a/b"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:8>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "00"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:5>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "\n"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<null>"}}, 1), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:3>", "<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPreferredName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{" (0x1F"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "<1.5"}, {"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<i:-51>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"isRequired", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:5>", "", "1L"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:8>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getTriggers", ""}, {"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<null>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"TitleTitleaI b"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:8>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 3), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "Switc.h.already.set", "1.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:0>", "false"}, {"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<empty>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:4>", "<empty>", "<sample:3>"}, {"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:1>"}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:11>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:2>", "nul\r"}, {"org.apache.commons.cli2.option.GroupImpl", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"aI "}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getDescription", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:2>", "<b:false>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:7>", "0/", "1dE-5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<null>", "1/5"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:3>"}}, 1), new String[][]{{"add", "java.lang.Object", "2"}, {"ensureCapacity", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"1-251.12345678901234567"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"Hello, World2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMaximum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getTriggers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "defaults", "org.apache.commons.cli2.WriteableCommandLine", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"aI b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<empty>", "<empty>", "<sample:1>", "a-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a1.12345678", "ab,c"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"21474p83648", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:3>", "<s:8key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"2020-01-01", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPreferredName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 public void testGeneratedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>", "0x123456789"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:6>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"Switch.alrready.set|", "false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getMinimum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<s:a9>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:0>", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.5g", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "findOption", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getId", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getAnonymous", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "2147-4-p83648", "Missing.otion"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Missing.otion", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "0x123455789aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String", "<sample:0>", "a-"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<sample:6>"}}), new String[][]{{"isEmpty", "", "3"}, {"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "<sample:3>", "Switch.already.set1.5f"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "--2", "a-0/0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a-0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "21474p83648", ".1.n"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<null>", "false"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".1.n", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<empty>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"Hello- World"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "true"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:5>", "12345678901234567890134567890"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"<a>b</`="}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"a b+1"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"000", "<s:+kb>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "-.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+kb", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator", "java.lang.String"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>", "PT0H"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:6>", "false"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:9>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:8>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "http://example..com/a?b=", "0.5c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"2."}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:0>", ";Missing.otionaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"12:30945"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"00", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:6>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "Hello, World"}}), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:7>", "214A74p83648{\"a\":1}"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x123456789", "<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"0x22346789"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"/a"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<s:;bb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:8>", "21474p83648"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "-4194278", "<sample:2>", "<empty>"}, {"org.apache.commons.cli2.option.GroupImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2147483647", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"http9//example.com/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:8>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:2>", "<sample:1>"}, false), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:2>", "Switch"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"//b"}, false), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"2147-44-p83648"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "hashCode", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "a,b,c<a>b</a>"}}), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"P1H"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:4>", "Title", "1.1234567891123456a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:3>", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"Hello- World"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "2120-02-30T25:1:61", "!"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:keBy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:9>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false), new String[][]{{"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "7"}, {"canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<s:8key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8key", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"aII b-1"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", ",rue"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "200-", "80.0PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false), new String[][]{{"retainAll", "java.util.Collection", "5"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "srue.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:4>"}}), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{">[1,2]"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<s:b>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "Switch.alrready.set|1.12345678901234567"}}), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "a,b+c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "isRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "L[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.51.1234567"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addOption", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "setParent", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "setParent", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNull(actual);
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d", "abc"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"S1+5f"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:2>", "<b:true>"}}), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<null>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:7>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "{\"a\":1}C"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"\n2020-02-30T25:61:61"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:7>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:5>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<null>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "Missinf.optWion", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a 0 sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<s:pa.>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pa.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:4>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"a1.12345678", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"1.5f2147483648"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:7>", "a b", ",-2"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:2>", "1.HC", " )"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "0"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", "202\r0-01-01"}}), new String[][]{{"getPrefixes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:5>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "PT1H|", "a1.1234Hello, World"}}), new String[][]{{"listIterator", "", "5"}, {"set", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getPrefixes", ""}, {"org.apache.commons.cli2.option.GroupImpl", "equals", "java.lang.Object", "<sample:4>"}});
  assertNull(actual);
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:3>", "-0.0", "Unexpected.token"}}), new String[][]{{"get", "int", "5"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "checkPrefixes", "java.util.Set", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "", "1.12345771.5e300"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "Hello- Word", "Unexpected.token"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345771.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:6>", "true"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:3>", "Switc", ".-1"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"a"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1E-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:1>", "true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:5>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "ab+c", "1,2]"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Hello, World", "<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "ab,c", "1.6c"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.6c", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String"}, new String[]{"<sample:1>", ".1"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:3>", "0x123456789\"", "PT0H 1e10"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1.5.5http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "1L2"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", "org.apache.commons.cli2.Option", "<sample:5>"}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}}), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"TitleTITLE"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "getMaximum", ""}, {"org.apache.commons.cli2.option.GroupImpl", "getMinimum", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:0>", "<null>"}}), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setCurrentOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "org.apache.commons.cli2.Option,java.lang.String,java.lang.String", "<sample:3>", "nulk", "MissiFg.option"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.GroupImpl", "org.apache.commons.cli2.option.GroupImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.GroupImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator,java.lang.String", "<sample:2>", "<null>", "<sample:3>", "1.5f"}, {"org.apache.commons.cli2.option.GroupImpl", "findOption", "java.lang.String", "mulll"}});
  assertNull(actual);
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"00-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}}), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:8>", "<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",1", "a1.12345678"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"Titlei", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "0", "<s:a>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:9>", "<s:jex>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"-1Unexpected.token", "<d:1.5>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "!("}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:2>", "true"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Missing.otion2147483648", "1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:1>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "jaI b", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<s:+dkb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:7>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:0>"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"21474p83648Hello, World", "<s:SB>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "1.12345678", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SB", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<s:key>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:6>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "2147483648010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:6>", "true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "0x123456789"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "TITLF"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:8>", "<s:a>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",0", "---2"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:3>"}, {"org.apache.commons.cli2.WriteableCommandLine", "getCurrentOption", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:3>", "<d:-57.0>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:0>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:2>"}}), new String[][]{{"size", "", "7"}, {"iterator", "", "1"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"--1", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option", "<sample:7>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String", "--X1"}}), new String[][]{{"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "123456789012345678901234567890", ""}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "java.lang.String,java.util.List", "t6rue", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"PT11"}, false, 5, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "Switch.alrready.set|{\"a\":1}", "1.1234w67"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:6>", "<d:1.562>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getCurrentOption", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:2>"}}), new String[][]{{"getId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"org.apache.commons.cli2.Option", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "2", "1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:6>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "java.lang.String", "0x12356789"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\u00e9|", "<s:,b>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",b", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
}
