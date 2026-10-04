package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:0>", "Hello, World"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:6>", "<sample:3>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getValidator", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:5>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "Helko, World", "0x1FPT1H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<null>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "THTLE"}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"2020-01-011E-5", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option", "<null>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:5>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5", "<b:false>"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<null>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:0>"}}, 3), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.AbstractList$RandomAccessSubList", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "\"1<25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:5>", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:3>", "true"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:4>", "<i:1>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<null>"}, {"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "<null>"}}, 3), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine,org.apache.commons.cli2.Option", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:10>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "01.5e3s00", "1.12345678901234567/a/b"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "H", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"\"\""}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "020"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine", "<sample:5>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:1>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"{\"a\":1}\"1.25", "<i:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:6>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a1> [<a2> ...]", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a1> [<a2> ...]", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", "a,b,c"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.12345u678901234567--"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.lang.String", "<sample:5>", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"/;/b"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"2247483647"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "1.6", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18098180", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<sample:0>"}}, 1), new String[][]{{"iterator", "", "3"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:5>", "<b:false>"}}, 3), new String[][]{{"size", "", "5"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:7>", "<sample:9>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, Workd", ""}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"2020-02-30T2i:61:61"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{" ..f.", "false"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"earg"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"!", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1234567890123456", "<sample:2>"}, false, 0, null, 2), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, , ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "112:30:45--", "Gello, World--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:7>", "false"}}, 1), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"-_-"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "processValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator", "org.apache.commons.cli2.Option"}, new String[]{"<sample:2>", "<sample:5>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"1..5Switch.already.set"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1/5f\u00e9", "<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:9>", "<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:9>"}}, 2), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<null>", "<sample:1>", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", ".5", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483644", "<sample:3>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<empty>", "<sample:3>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"0", "<sample:0>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:3>", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:11>", "5.0wFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:4>", "<i:-2147483648>"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:4>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:2>", "false"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ey>"}, false, 7, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getValidator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 3), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{" ..."}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:8>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:3>"}}, 1), new String[][]{{"get", "int", "2"}, {"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "findOption", "java.lang.String", "Switch.alreaddy.set"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "false"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"200-01-01"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:2>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}\"1.250x1F"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"5\n.5"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<null>", "<sample:2>", "<sample:8>"}, {"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<null>", "<empty>", "<sample:3>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.225", ","}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"2147483647", "<sample:0>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<null>", "<i:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"1.12345678true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:10>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "2", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18098180", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<empty>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "helpLines", "int,java.util.Set,java.util.Comparator", "0", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "hashCode", ""}, {"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"true", "<i:18>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:6>", "<s:bB>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:10>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a1> [<a2> ...]", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:4>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:10>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<sample:3>", "<sample:2>"}, false), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", "java.lang.StringBuffer,java.util.Set,java.util.Comparator", "<sample:0>", "<sample:6>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 4, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:10>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", new String[]{"java.lang.String"}, new String[]{"nll"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.225w"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "-10", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "process", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "process", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:8>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"nu", "false"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:4>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", "org.apache.commons.cli2.Option", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false), new String[][]{{"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "1.1234567", "{\"ra\":1}\"1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a 0 sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1.265"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:wa>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String", ".9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("wa", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:4>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", "java.lang.String,java.lang.String", "i214T483647", "1020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:2>", "--11"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"a aa b"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<s:b>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:12>"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "-1\t", "<s:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"20D20-01-01"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:0>", "[1,2]b"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:3>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:4>", "<null>"}}), new String[][]{{"contains", "java.lang.Object", "0"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:6>", "true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:3>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"-11.5"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", "15f", "nt"}}), new String[][]{{"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}\"1.25"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", ""}, {"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false), new String[][]{{"remove", "java.lang.Object", "3"}, {"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPreferredName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"g.123456789123456", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String,java.lang.Object", "12345678901234-5678901234567890", "<i:2>"}}), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"Hello- World", "true"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12930:44", "-1.<"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.<", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{" <a>b=/a>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:3>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:8>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<null>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "processValues", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator,org.apache.commons.cli2.Option", "<sample:10>", "<sample:4>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", "org.apache.commons.cli2.Option,java.lang.Boolean", "<sample:6>", "true"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getId", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "findOption", new String[]{"java.lang.String"}, new String[]{"Argument.misssing.values"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "a aa b", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<null>", "<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:8>", "<i:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:0>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOption", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:13>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "processValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator", "org.apache.commons.cli2.Option"}, new String[]{"<sample:2>", "<empty>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1L", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"`c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.[1,2]", "0xFFFFFFFF"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"1", "<sample:4>", "<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"isEmpty", "", "0"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"\t"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2", "<null>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:6>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<empty>", "<sample:2>", "<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:4>", "<null>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaults", new String[]{"org.apache.commons.cli2.WriteableCommandLine"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", "org.apache.commons.cli2.WriteableCommandLine,org.apache.commons.cli2.Option", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:12>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:1>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addValue", new String[]{"org.apache.commons.cli2.Option", "java.lang.Object"}, new String[]{"<sample:2>", "<d:1.5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultSwitch", new String[]{"org.apache.commons.cli2.Option", "java.lang.Boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:2>", "-0.0"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getMaximum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "canProcess", "org.apache.commons.cli2.WriteableCommandLine,java.util.ListIterator", "<sample:4>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tity", "!..."}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getInitialSeparator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "helpLines", new String[]{"int", "java.util.Set", "java.util.Comparator"}, new String[]{"-2147483648", "<null>", "<sample:2>"}, false, 5, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getPrefixes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:10>", "<sample:1>"}, false, 7, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option", "java.util.List"}, new String[]{"<sample:1>", "<sample:2>"}, false), new String[][]{{"contains", "java.lang.Object", "3"}, {"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"<a>b<//aa>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "1.123456712:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String"}, new String[]{"1.12345678{\"a\":1}"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getSwitch", "java.lang.String,java.lang.Boolean", "Switch.alre9dy.set", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1K", "i{\"a\":1}\"1.250x1F"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i{\"a\":1}\"1.250x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "canProcess", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "java.lang.String"}, new String[]{"<sample:8>", "2020-01-P1abc"}, false, 5, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "checkPrefixes", "java.util.Set", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "a", "21474836481"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String"}, new String[]{"y"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"`"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0x12346789"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12346789", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getValidator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getValidator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "looksLikeOption", "java.lang.String", "WI"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", "org.apache.commons.cli2.Option,boolean", "<null>", "true"}}, 3), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L.1234567890123456", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "1.12345u678901234567--", "a,,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"java.lang.String"}, new String[]{"brg"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", ""}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "addProperty", "java.lang.String,java.lang.String", ".5\u00e9", "1-5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"0yFFFFFFFF"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getConsumeRemaining", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "validate", "org.apache.commons.cli2.WriteableCommandLine,org.apache.commons.cli2.Option", "<sample:5>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "setDefaultValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "stripBoundaryQuotes", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getTriggers", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "defaultValues", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getNormalised", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"1"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "validate", new String[]{"org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.Option"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getDefaultValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli2.OptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<null>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:10>"}, false), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "getSubsequentSeparator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getConsumeRemaining=null, getDescription=null, getId=0, getInitialSeparator=\000, getMaximum=0, getMinimum=0, getPreferredName=null, getSubsequentSeparator=\000, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1346517445", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample1> <sample2> [<sample3>] {getConsumeRemaining=0, getDescription=, getId=9, getInitialSeparator=0, getMaximum=3, getMinimum=2, getPreferredName=sample, getSubsequentSeparator=\000, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{"1M"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "a 0 sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", new String[]{"java.lang.String"}, new String[]{"2020-02-v30T25:61:61"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getUndefaultedValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", ""}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", "org.apache.commons.cli2.Option,java.lang.Object", "<sample:0>", "<i:-65>"}}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "hasOption", new String[]{"java.lang.String"}, new String[]{"nu"}, false, 7, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionTriggers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli2.option.ArgumentImpl", "getMinimum", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a1> [<a2> ...] {getConsumeRemaining=, getDescription=0, getId=7, getInitialSeparator= , getMaximum=2147483647, getMinimum=1, getPreferredName=a, getSubsequentSeparator=a, isRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0xFFFFFFFF ", "<sample:0>"}, false), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli2.option.ArgumentImpl", "org.apache.commons.cli2.option.ArgumentImpl", "appendUsage", new String[]{"java.lang.StringBuffer", "java.util.Set", "java.util.Comparator"}, new String[]{"<null>", "<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 sample ", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValue", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addOption", "org.apache.commons.cli2.Option", "<sample:9>"}, {"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "looksLikeOption", "java.lang.String", "a b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", new String[]{"org.apache.commons.cli2.Option"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a 0", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Switch.alre", "12:30:45"}, false, 5, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getProperty", "java.lang.String,java.lang.String", "a c", "-11E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getOptionCount", new String[]{"java.lang.String"}, new String[]{">"}, false, 0, new String[][]{{"org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "getValues", "org.apache.commons.cli2.Option,java.util.List", "<sample:4>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli2.WriteableCommandLine", "org.apache.commons.cli2.commandline.WriteableCommandLineImpl", "addSwitch", new String[]{"org.apache.commons.cli2.Option", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli2.WriteableCommandLine", "getUndefaultedValues", "org.apache.commons.cli2.Option", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 sample ", SearchInputFactory_scaffolding.receiverState());
 }
}
