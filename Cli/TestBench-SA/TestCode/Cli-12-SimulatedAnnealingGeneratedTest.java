package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<null>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"<a>b</a>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<null>", "<empty>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:2>"}});
  assertNull(actual);
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:2>", "true"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:2>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<empty>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "http://example.com/a?b=c", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<empty>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "http://example.com/a?b=c", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<empty>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "true"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:2>", "false"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:0>", "false"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:2>", "false"}, false, 10, new String[][]{}), new String[][]{{"hasOption", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<empty>", "true"}, false), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<null>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<null>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<null>"}}), new String[][]{{"getOptionValue", "char", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<empty>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:1>", "<empty>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false), new String[][]{{"hasOption", "java.lang.String", "7"}, {"getOptionObject", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:2>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 0, null, 3), new String[][]{{"getOptionObject", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<null>", "<empty>", "true"}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "/a/b", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "false"}}, 1), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"/x1234567891.5e3000", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<null>", "<empty>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "<null>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "<null>", "<empty>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "false"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false), new String[][]{{"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 9, new String[][]{}), new String[][]{{"getOptionValue", "char,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<empty>"}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<empty>"}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1), new String[][]{{"getOptionValue", "java.lang.String", "0"}});
  assertNull(actual);
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "0xFFFFFFFF", "<sample:5>"}}, 1), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "<>b</a>", "<null>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "7"}, {"getOptionValue", "char,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<null>"}, false, 15, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "5.", "<empty>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}), new String[][]{{"getOptionValue", "java.lang.String", "7"}, {"getOptionValue", "char,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:4>", "<null>"}, false, 15, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "5.", "<empty>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 2), new String[][]{{"getOptionValue", "java.lang.String", "7"}, {"getOptionValue", "char,java.lang.String", "7"}, {"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "5.", "<empty>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<null>", "<sample:3>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:2>", "<empty>"}, false), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "false"}}), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:0>", "<sample:3>", "false"}}, 2), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"3", "<sample:2>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"", "<null>"}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "true"}}), new String[][]{{"getRequiredOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<empty>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}), new String[][]{{"isEmpty", "", "0"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:0>", "false"}, false, 13, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<empty>", "false"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<empty>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 3), new String[][]{{"add", "java.lang.Object", "7"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}), new String[][]{{"add", "java.lang.Object", "7"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:2>", "true"}}, 2), new String[][]{{"add", "java.lang.Object", "7"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "true"}, false, 0, null, 2), new String[][]{{"hasOption", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "true"}, false), new String[][]{{"hasOption", "char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "true"}, false), new String[][]{{"hasOption", "char", "5"}, {"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:1>", "false"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:4>"}}), new String[][]{{"hasOption", "char", "5"}, {"getOptionValue", "java.lang.String,java.lang.String", "7"}, {"getOptionValue", "char,java.lang.String", "3"}, {"getOptionValues", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:1>", "<empty>"}, false), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<null>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<empty>"}}), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<empty>"}, false, 0, null, 1), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 3), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 3), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:9>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:3>"}}, 2), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 2), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptionObject", "char", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t?ssvf", "<sample:3>"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:8>", "<sample:1>", "false"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 1), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<empty>", "<null>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}), new String[][]{{"add", "java.lang.Object", "2"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}, 3), new String[][]{{"add", "java.lang.Object", "2"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<null>", "<null>"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
 }
 public void testGeneratedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<null>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 2), new String[][]{{"getOptionValue", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:2>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:1>", "<sample:0>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<null>"}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "a b", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"1.5f", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:1>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "1", "<empty>"}}, 2), new String[][]{{"getOptionObject", "java.lang.String", "7"}, {"getOptionValue", "java.lang.String,java.lang.String", "6"}, {"hasOption", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "false"}}, 3), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 0, null, 1), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false, 0, null, 1), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, false, 11, new String[][]{}, 3), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<empty>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "7"}, {"getArgList", "", "4"}, {"getFirst", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:2>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 2), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<empty>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<null>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<sample:0>", "true"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<empty>", "true"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<null>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 2), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<empty>"}}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"getArgList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<null>", "false"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "5"}, {"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false, 0, null, 3), new String[][]{{"getOptionObject", "java.lang.String", "3"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<null>"}, false, 10, new String[][]{}, 3), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<empty>"}}, 3), new String[][]{{"getOptionValue", "char", "0"}, {"getOptionObject", "char", "7"}, {"getOptionValues", "char", "3"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:1>", "true"}}), new String[][]{{"getOptions", "", "3"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "setOptions", new String[]{"org.apache.commons.cli.Options"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<null>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:0>", "<null>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<empty>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<null>", "<empty>", "false"}}), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "Title", "<empty>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:0>", "<null>", "true"}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "3"}, {"getArgList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1), new String[][]{{"hasOption", "java.lang.String", "3"}, {"getArgList", "", "7"}, {"addFirst", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<null>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<null>", "<sample:0>", "true"}}, 1), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:1>", "<null>", "false"}}), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}, {"getRequiredOptions", "", "5"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:6>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1), new String[][]{{"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<null>", "true"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:0>", "true"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:8>", "false"}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:9>", "true"}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "[1,2]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"3", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:0>", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"getOptions", "", "2"}, {"contains", "java.lang.Object", "3"}, {"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:9>", "<empty>", "<sample:5>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "checkRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 0, null, 2), new String[][]{{"getOptionValues", "java.lang.String", "6"}, {"getOptionObject", "char", "5"}, {"hasOption", "char", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "false"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:9>", "false"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:7>"}}), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "2"}, {"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}}, 2), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "1e10", "<empty>"}, {"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:0>", "<sample:1>", "true"}}, 3), new String[][]{{"addOptionGroup", "org.apache.commons.cli.OptionGroup", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<null>", "<sample:3>"}}, 1), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<empty>"}, false, 10, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 3), new String[][]{{"getOptionValue", "char", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<null>", "<sample:2>"}}, 3), new String[][]{{"getOptions", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:3>"}}, 3), new String[][]{{"add", "java.lang.Object", "4"}, {"listIterator", "", "3"}, {"nextIndex", "", "5"}, {"nextIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:1>", "<empty>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getArgList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getArgList", "", "1"}, {"element", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false, 0, null, 1), new String[][]{{"getOptionObject", "char", "4"}, {"getArgList", "", "1"}, {"element", "", "4"}, {"removeLast", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", " .5e300", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", " .5e300", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<empty>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:6>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:0>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:1>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<empty>", "<null>"}, false, 0, null, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:8>", "<sample:0>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 3), new String[][]{{"getArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<empty>", "<null>"}, false, 14, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3), new String[][]{{"getOptionObject", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<null>", "<empty>", "true"}, false, 0, null, 3), new String[][]{{"getOptionValue", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:3>", "<sample:3>", "false"}, {"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 1), new String[][]{{"getOptions", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:1>"}}, 2), new String[][]{{"hasOption", "java.lang.String", "4"}, {"iterator", "", "4"}, {"hasNext", "", "4"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:2>"}}, 1), new String[][]{{"addOption", "org.apache.commons.cli.Option", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Options", actual.getClass().getName());
  assertEquals("[ Options: [ short {0=[ option: 0  [ARG] ::  ]} ] [ long {} ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:0>", "<sample:3>", "true"}}, 3), new String[][]{{"addOption", "java.lang.String,boolean,java.lang.String", "6"}, {"getRequiredOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"add", "java.lang.Object", "6"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "false"}}, 2), new String[][]{{"add", "java.lang.Object", "3"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<null>", "<sample:0>"}}), new String[][]{{"getRequiredOptions", "", "0"}, {"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<null>", "<sample:0>"}}, 1), new String[][]{{"getRequiredOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:1>", "true"}}, 2), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "7"}, {"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<empty>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:0>", "false"}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "--1", "<null>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<null>", "<empty>", "true"}}, 1), new String[][]{{"clear", "", "0"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:7>", "<sample:0>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<null>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<empty>", "true"}}, 1), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:5>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:1>", "true"}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<empty>", "<null>", "true"}, false, 1, new String[][]{}, 1), new String[][]{{"getOptionValue", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "<null>", "true"}, false, 11, new String[][]{}, 3), new String[][]{{"getOptionValue", "char,java.lang.String", "2"}, {"getOptions", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<null>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 3), new String[][]{{"hasOption", "char", "6"}, {"hasOption", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:3>", "false"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:2>", "true"}}, 1), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "true"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<null>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"iterator", "", "6"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "2147483648", "<empty>"}}, 2), new String[][]{{"getRequiredOptions", "", "1"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 public void testGeneratedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "214\t7483648123456789012345678901234567890", "<empty>"}}, 2), new String[][]{{"getRequiredOptions", "", "1"}, {"lastIndexOf", "java.lang.Object", "2"}, {"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<empty>", "<empty>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:1>", "<sample:0>"}}, 1), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "true"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}}, 3), new String[][]{{"hasOption", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "true"}}), new String[][]{{"hasOption", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:1>", "<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:1>", "<null>"}}), new String[][]{{"hasOption", "java.lang.String", "4"}, {"getOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  [ARG] :: null :: class java.io.File ] {getArgName=arg, getArgs=1, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true...#316#-1491864084", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<empty>", "true"}, {"org.apache.commons.cli.GnuParser", "getOptions", ""}}, 2), new String[][]{{"getOptions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<empty>", "false"}}, 2), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3), new String[][]{{"getRequiredOptions", "", "1"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<empty>", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:1>"}}, 3), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "http://example.com/a?b=c", "<empty>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"getOption", "java.lang.String", "0"}, {"getOptionGroup", "org.apache.commons.cli.Option", "0"}, {"hasOption", "java.lang.String", "6"}, {"hasOption", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:7>", "<sample:2>"}, {"org.apache.commons.cli.GnuParser", "getRequiredOptions", ""}}, 1), new String[][]{{"getRequiredOptions", "", "0"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "false"}, false, 14, new String[][]{{"org.apache.commons.cli.GnuParser", "getOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<null>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}}, 2), new String[][]{{"clear", "", "5"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:0>", "true"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:0>", "<sample:2>", "false"}}, 3), new String[][]{{"getOptions", "", "2"}, {"removeAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "false"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<empty>", "<empty>", "true"}, false, 17, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "1.25", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:1>", "<empty>"}}, 1), new String[][]{{"iterator", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<empty>", "false"}}, 1), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "1"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getRequiredOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:6>"}, {"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "1.1234567890123456", "<sample:3>"}}, 1), new String[][]{{"clone", "", "5"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "<empty>", "false"}, false, 11, new String[][]{{"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:2>", "<empty>"}, {"org.apache.commons.cli.GnuParser", "flatten", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:0>", "false"}}, 1), new String[][]{{"getOptionValue", "java.lang.String", "6"}, {"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:7>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "flatten", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:7>", "true"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "checkRequiredOptions", ""}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:2>", "false"}, {"org.apache.commons.cli.GnuParser", "processProperties", "java.util.Properties", "<sample:0>"}}, 1), new String[][]{{"getOptions", "", "2"}, {"removeAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 public void testGeneratedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}}, 1), new String[][]{{"getRequiredOptions", "", "1"}, {"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processArgs", new String[]{"org.apache.commons.cli.Option", "java.util.ListIterator"}, new String[]{"<sample:7>", "<sample:11>"}, false, 1, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", "abc", "<sample:0>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.GnuParser", "processOption", "java.lang.String,java.util.ListIterator", ".5", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "processArgs", "org.apache.commons.cli.Option,java.util.ListIterator", "<sample:5>", "<sample:1>"}, {"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<empty>"}}, 1), new String[][]{{"hasOption", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "getOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:0>", "<sample:1>", "false"}}, 3), new String[][]{{"getOptionGroup", "org.apache.commons.cli.Option", "1"}, {"addOption", "org.apache.commons.cli.Option", "2"}, {"getOption", "java.lang.String", "7"}, {"getLongOpt", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"b", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"a", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:3>"}, {"org.apache.commons.cli.GnuParser", "setOptions", "org.apache.commons.cli.Options", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.GnuParser", "org.apache.commons.cli.GnuParser", "processOption", new String[]{"java.lang.String", "java.util.ListIterator"}, new String[]{"t", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.cli.GnuParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<null>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.MissingArgumentException", thrown.getClass().getName());
 }
}
