package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "010", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "010", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "010", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "110", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "110", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"getOptionValues", "char", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLE", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {a=[ option: a  [ARG] :: null :: class java.io.File ], b=[ option: b  [ARG] :: null :: class java.net.URL ], t=[ option: t  [ARG] :: null :: class java.net.URL ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}), new String[][]{{"getRequiredOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:1>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "1"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"-", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<empty>", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"\n", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"\n\n", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "<empty>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "<sample:1>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"PT1H", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "true"}}), new String[][]{{"hasOption", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "false"}}, 1), new String[][]{{"hasOption", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "true"}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:9>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "[1,2]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-0.0", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "[1,2]", "<empty>"}}, 1), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<null>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false), new String[][]{{"getOptionValue", "java.lang.String", "5"}, {"getOptionValue", "char,java.lang.String", "0"}, {"getOptionObject", "char", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:4>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:2>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:1>", "<null>", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNull(actual);
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "true", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<empty>", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<empty>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<empty>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 0, null, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678", "false"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1e10", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "0x1F", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<null>", "true"}, false), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "0"}, {"getOptionValue", "java.lang.String,java.lang.String", "4"}, {"getOptionObject", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "false"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"5h", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<null>", "<sample:1>", "false"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"5h", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<null>", "<sample:1>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<empty>", "<null>"}, false), new String[][]{{"getOptionValue", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<empty>", "<null>"}, false), new String[][]{{"getOptionValue", "java.lang.String", "3"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<null>", "<sample:0>", "false"}}), new String[][]{{"getOptionValue", "java.lang.String", "3"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:7>", "<null>"}, false), new String[][]{{"getOptionValue", "java.lang.String", "3"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:1>", "<null>"}, false), new String[][]{{"getOptionValues", "java.lang.String", "2"}, {"iterator", "", "7"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:0>", "<null>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.1234567", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:7>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.1234567", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"<a>b</a>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"<b>b<.a>.5", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}), new String[][]{{"iterator", "", "2"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<null>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:1>", "true"}}, 1), new String[][]{{"iterator", "", "2"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<null>", "<sample:3>"}}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<sample:7>", "<null>", "false"}}), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<sample:7>", "<null>", "false"}}), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<sample:7>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<null>", "<null>", "false"}}), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<null>", "<null>", "false"}}, 1), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:0>", "<sample:0>", "true"}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<null>", "<sample:2>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:2>", "<empty>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{" ", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{".5", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "\t", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}}, 3), new String[][]{{"isEmpty", "", "4"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"1.25", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<empty>", "<empty>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "false"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<null>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<empty>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:3>", "true"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<null>", "<null>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "+1", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:4>", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "+112:30:45", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:4>", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:0>", "<sample:1>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:7>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:3>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:7>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "http://example.com/a?b=c", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<sample:8>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:2>", "false"}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "7"}, {"getOptionProperties", "java.lang.String", "7"}, {"elements", "", "6"}, {"hasMoreElements", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:0>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<empty>", "false"}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "7"}, {"getOptionProperties", "java.lang.String", "7"}, {"elements", "", "6"}});
  assertNotNull(actual);
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<empty>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 3), new String[][]{{"getOptionValue", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<empty>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "Title", "<null>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1), new String[][]{{"hasOption", "java.lang.String", "7"}, {"getOptionValues", "char", "3"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:7>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "Title", "<null>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1), new String[][]{{"hasOption", "java.lang.String", "7"}, {"getOptionValues", "char", "3"}, {"iterator", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<empty>", "<empty>", "true"}, false), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}, {"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<empty>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<empty>", "true"}, false, 0, null, 3), new String[][]{{"getOptionValues", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:0>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, null, 1), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:1>", "<sample:3>"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:10>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<null>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "char", "5"}, {"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:2>", "false"}}, 2), new String[][]{{"getOptionProperties", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:2>", "false"}}, 2), new String[][]{{"getOptionProperties", "java.lang.String", "2"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<sample:2>", "false"}}, 2), new String[][]{{"getOptionProperties", "java.lang.String", "2"}, {"contains", "java.lang.Object", "3"}, {"storeToXML", "java.io.OutputStream,java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.UnsupportedEncodingException", thrown.getClass().getName());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<null>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}), new String[][]{{"getOptionProperties", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.12445678", "<empty>"}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "` a", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<empty>", "false"}, false, 0, null, 3), new String[][]{{"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:0>"}}, 3), new String[][]{{"getOptionProperties", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"[1,2]", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:7>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:0>", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "5.", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.1234567", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "5.", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "1.1234567", "<null>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"getRequiredOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<empty>", "false"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<null>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "5", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:7>", "false"}}, 1), new String[][]{{"getRequiredOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:2>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "false"}}, 1), new String[][]{{"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<null>", "<empty>", "true"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "false"}}, 1), new String[][]{{"getArgList", "", "7"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:2>", "true"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 1), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[--, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:2>", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:7>", "false"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}, {"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:2>", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:7>", "true"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}, {"hasOption", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<null>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "2020-02-30T25:61:61", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "5"}, {"getOptionGroup", "org.apache.commons.cli.Option", "4"}, {"addOptionGroup", "org.apache.commons.cli.OptionGroup", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<sample:6>", "<empty>"}, false, 1, new String[][]{}, 2), new String[][]{{"getOptionValue", "char", "3"}, {"getOptionValues", "java.lang.String", "4"}, {"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:6>", "<null>"}, false, 1, new String[][]{}, 2), new String[][]{{"getOptionValue", "char", "3"}, {"getOptionValues", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"  ", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:7>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:7>", "<sample:1>"}}), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}, {"getRequiredOptions", "", "2"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:7>", "<empty>"}, false, 0, null, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:7>", "<empty>"}, false, 0, null, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:6>", "<empty>"}, false, 0, null, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "2"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:6>", "<empty>"}, false, 0, null, 3), new String[][]{{"getArgList", "", "2"}, {"push", "java.lang.Object", "6"}, {"lastIndexOf", "java.lang.Object", "4"}, {"pollFirst", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "abc", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:1>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "2"}, {"getOptionProperties", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "abc", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:1>"}}), new String[][]{{"getOptionValue", "java.lang.String", "2"}, {"getOptionProperties", "java.lang.String", "4"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<null>", "false"}, false, 0, null, 3), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<empty>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<null>", "<sample:0>"}}), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "2020-01-01", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "2020-01-300T25:60:61", "true"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "12:3f_:4", "<empty>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "1"}, {"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:0>", "<sample:2>", "true"}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<null>"}}), new String[][]{{"getOptions", "", "1"}, {"contains", "java.lang.Object", "0"}, {"clear", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}}, 1), new String[][]{{"getOptionValues", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "<null>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"getOptionValue", "char", "2"}, {"getOptionValue", "char,java.lang.String", "4"}, {"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:0>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "Hello, World", "<sample:3>"}}, 2), new String[][]{{"getOptionProperties", "java.lang.String", "6"}, {"replace", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "I", "true"}}, 3), new String[][]{{"getOptionObject", "char", "7"}, {"getArgs", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:2>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.5", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:7>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "[1,", "false"}}, 2), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:11>", "<sample:7>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:1>", "false"}}, 2), new String[][]{{"hasOption", "java.lang.String", "3"}, {"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<null>"}}, 2), new String[][]{{"getArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:10>", "<sample:4>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "2020-02-30T25:61:61", "<sample:3>"}}, 3), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:7>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "0xFFFFFFFF010", "<empty>"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "5"}, {"getOptionValue", "char,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:7>", "<sample:1>"}}), new String[][]{{"ensureCapacity", "int", "0"}, {"isEmpty", "", "6"}, {"add", "java.lang.Object", "4"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:7>", "<sample:4>"}}), new String[][]{{"ensureCapacity", "int", "0"}, {"isEmpty", "", "2"}, {"clear", "", "4"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "0x123456789", "<empty>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:2>", "<sample:5>"}}, 3), new String[][]{{"ensureCapacity", "int", "3"}, {"isEmpty", "", "2"}, {"clear", "", "4"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<empty>", "false"}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<empty>"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:3>"}}, 2), new String[][]{{"getOptionValues", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "<empty>", "false"}, false, 11, new String[][]{}, 1), new String[][]{{"hasOption", "char", "0"}, {"getOptionObject", "java.lang.String", "7"}, {"getOptionValue", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:2>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:2>"}}, 2), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:5>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "0"}, {"getOption", "java.lang.String", "1"}, {"getRequiredOptions", "", "1"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "1.12345678901234567", "true"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "Ob", "false"}});
  assertNull(actual);
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "0x1F", "<sample:1>"}}, 2), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:0>", "true"}}, 2), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"hasOption", "java.lang.String", "5"}, {"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}}, 2), new String[][]{{"addOption", "org.apache.commons.cli.Option", "5"}, {"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "true"}}, 1), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "-1", "true"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<null>"}, {"org.apache.commons.cli.PosixParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2), new String[][]{{"getOption", "java.lang.String", "1"}, {"getValue", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:2>"}}, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<null>", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "123456789012345678901234567890", "<sample:3>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:2>"}}, 1), new String[][]{{"iterator", "", "4"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "burstToken", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1}", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "getOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "aaaaaaaaaaaaaaaaaaaaaaaaaFaaaaa", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<empty>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:6>", "true"}, {"org.apache.commons.cli.PosixParser", "getOptions", ""}}, 3), new String[][]{{"getRequiredOptions", "", "4"}, {"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"lastIndexOf", "java.lang.Object", "7"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:2>", "false"}}, 1), new String[][]{{"getOptions", "", "4"}, {"isEmpty", "", "0"}, {"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "Ob", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<empty>", "<sample:1>", "false"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "processOption", "java.lang.String,java.util.ListIterator", "I", "<sample:1>"}}, 3), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "false"}}, 1), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<null>", "<sample:0>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "true"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<empty>", "<sample:2>", "true"}}, 3), new String[][]{{"addOption", "org.apache.commons.cli.Option", "7"}, {"getOptions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option:   [ARG] :: 0 ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 1), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "1"}, {"addOption", "org.apache.commons.cli.Option", "1"}, {"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: 0  [ARG] ::  ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:7>"}, {"org.apache.commons.cli.PosixParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:9>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.PosixParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:7>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[[ option: a  [ARG] :: null :: class java.io.File ], [ option: b  [ARG] :: null :: class java.net.URL ], [ option: t  [ARG] :: null :: class java.net.URL ]]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}, {"org.apache.commons.cli.PosixParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:10>"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "false"}, {"org.apache.commons.cli.PosixParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:2>", "true"}});
  assertNull(actual);
 }
 public void testGeneratedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.PosixParser", "org.apache.commons.cli.PosixParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.cli.PosixParser", "burstToken", "java.lang.String,boolean", "\n", "false"}, {"org.apache.commons.cli.PosixParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
