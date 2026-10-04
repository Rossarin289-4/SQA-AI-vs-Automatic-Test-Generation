package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<null>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"-0/0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<null>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<empty>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:3>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:0>", "true"}}), new String[][]{{"getOptionValues", "java.lang.String", "5"}});
  assertNull(actual);
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"0txFFFFFFFF"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:7>", "<empty>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"getOptionValue", "char,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:2>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<empty>", "<empty>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
 }
 public void testGeneratedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:1>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<null>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<empty>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", ">"}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false), new String[][]{{"getOptionValues", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"-0./"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:10>", "<sample:3>", "<sample:5>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:6>", "true"}}, 3);
  assertNull(actual);
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "z123456789012345678901234567890"}}), new String[][]{{"getParsedOptionValue", "java.lang.String", "3"}});
  assertNull(actual);
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:0>"}, false), new String[][]{{"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:5>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:12>", "<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "EErue"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:10>", "<sample:8>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:9>", "<sample:6>", "<sample:8>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:4>", "<empty>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:2>", "<empty>", "false"}}), new String[][]{{"getArgList", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:12>", "<empty>", "true"}, false, 0, null, 2), new String[][]{{"getOptionValue", "char,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"ITLE"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"010"}, false, 1, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:0>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:1>"}, false), new String[][]{{"getArgList", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:3>", "<empty>"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "1.50"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:2>", "<sample:9>", "true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, false, 4, new String[][]{}, 1), new String[][]{{"getArgList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<null>", "<null>", "false"}, false), new String[][]{{"getOptionObject", "java.lang.String", "7"}, {"getOptionValue", "char,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, false, 0, null, 2), new String[][]{{"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "`"}}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:4>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:4>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:10>", "<sample:4>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:10>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:2>", "false"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:10>", "<sample:0>", "<sample:5>"}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:0>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:12>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:13>", "<sample:5>", "false"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:0>"}}, 3), new String[][]{{"getOptionValue", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<empty>"}, false, 0, null, 3), new String[][]{{"getOptionValues", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "-0/"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:6>"}, false, 5, new String[][]{}, 2), new String[][]{{"getArgs", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:4>", "<sample:4>", "true"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "[1,2]123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:3>", "<null>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:3>", "<sample:0>", "<sample:3>"}}, 1), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:11>", "false"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<sample:8>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:12>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:3>", "false"}}, 1), new String[][]{{"getOptionProperties", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:1>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:10>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:11>", "<null>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:11>", "<sample:5>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:1>", "<sample:5>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:0>"}}), new String[][]{{"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", ".a/byes"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<sample:3>", "<sample:2>", "false"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:10>", "<sample:2>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"-0..0"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<null>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"-1.52147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:2>", "<sample:7>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:10>", "<sample:4>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:4>", "<sample:5>", "false"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "1.25"}}, 2), new String[][]{{"getArgList", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:4>", "<sample:6>", "false"}}, 1);
  assertNull(actual);
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:10>", "<sample:2>", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"getOptions", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:0>", "<sample:3>", "<sample:0>", "false"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:8>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<null>", "<sample:3>", "false"}}, 1), new String[][]{{"getOptionValue", "char", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:4>"}, false, 2, new String[][]{}, 1), new String[][]{{"getOptionValue", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:6>"}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:3>", "<sample:1>", "<sample:6>", "false"}}, 2), new String[][]{{"hasOption", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "11.12345678"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "20I20-02-30T25:6:61"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:6>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:6>", "<sample:3>"}}, 3), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 0, null, 1), new String[][]{{"hasOption", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "Helmp, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:12>", "<sample:1>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:7>", "<sample:1>", "true"}}, 1), new String[][]{{"hasOption", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{}, 3), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:12>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:5>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:10>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:4>", "<sample:6>", "true"}}, 2), new String[][]{{"getArgList", "", "1"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "<null>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:13>", "<sample:3>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<null>", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:9>", "<sample:3>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:1>", "true"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "1ee10 "}}, 2), new String[][]{{"getParsedOptionValue", "java.lang.String", "7"}});
  assertNull(actual);
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:2>", "<sample:5>", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:12>", "<sample:1>"}}, 2), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "false"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:3>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<sample:3>", "<empty>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:6>", "<sample:1>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:1>", "<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:3>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<empty>", "<sample:3>", "false"}}, 3), new String[][]{{"hasOption", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<null>", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "<null>", "true"}, false, 6, new String[][]{}), new String[][]{{"getOptionObject", "java.lang.String", "5"}, {"getArgList", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:7>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[, a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"-0/001.5e300"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<empty>", "<sample:1>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.cli.UnrecognizedOptionException", thrown.getClass().getName());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<empty>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:13>", "<sample:1>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:4>", "<sample:6>", "true"}}, 3), new String[][]{{"getOptionValues", "java.lang.String", "6"}});
  assertNull(actual);
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:12>", "<sample:1>", "<empty>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:10>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:5>", "<sample:6>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:1>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:1>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:1>", "<sample:4>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:11>", "<sample:4>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<empty>", "<empty>", "true"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "<null>", "true"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:6>"}, false, 4, new String[][]{}, 2), new String[][]{{"getOptionObject", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:0>", "<sample:6>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:2>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<null>", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "<null>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<sample:2>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:2>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<null>", "<sample:1>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "iHello, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:1>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:0>", "true"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "es"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[0, sample], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:4>", "<sample:8>", "<null>", "false"}, false, 0, null, 2), new String[][]{{"getOptionValues", "java.lang.String", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:9>", "<sample:4>", "<empty>", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<empty>", "<sample:6>"}}, 1), new String[][]{{"getOptionObject", "java.lang.String", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:3>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:9>", "<sample:4>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<empty>", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:8>", "<sample:4>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:10>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:10>", "<empty>", "<empty>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:5>", "<sample:4>", "<sample:1>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:8>", "<sample:8>", "<sample:0>", "true"}}, 2), new String[][]{{"getArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<sample:3>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:2>", "<sample:6>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:13>", "<sample:2>", "<empty>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<null>", "<null>", "<empty>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:10>", "<sample:3>", "<sample:0>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:9>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:15>", "<sample:8>"}}), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<empty>", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:9>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:2>", "<sample:4>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, , a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "1.25"}}), new String[][]{{"getArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "<null>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:5>", "<sample:6>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:1>", "<sample:1>", "<sample:4>", "false"}}, 1), new String[][]{{"hasOption", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:7>", "<sample:9>", "<sample:5>", "true"}}, 1), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:6>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "[1,2]0x1F0x1F"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "false"}}, 3), new String[][]{{"getOptionObject", "char", "4"}});
  assertNull(actual);
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<empty>"}, false, 0, null, 1), new String[][]{{"getOptionValues", "java.lang.String", "2"}});
  assertNull(actual);
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<empty>", "true"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<sample:3>", "<null>"}, false, 7, new String[][]{}, 2), new String[][]{{"getParsedOptionValue", "java.lang.String", "0"}, {"getOptionValue", "char", "1"}});
  assertNull(actual);
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<null>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:7>", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:4>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:11>", "<sample:9>", "<null>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[a, 0], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],boolean", "<sample:3>", "<sample:3>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:6>", "<sample:3>", "<sample:1>", "true"}}, 1), new String[][]{{"getArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "1L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"\037a"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:5>", "<sample:3>", "<empty>", "true"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:4>", "<sample:8>", "<sample:5>"}});
  assertNull(actual);
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:10>", "<sample:10>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "-1.5"}}, 2), new String[][]{{"getOptionValue", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:0>", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:6>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[]", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"getOptions", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.cli.Option;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:6>", "<sample:10>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:0>", "<empty>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.CommandLine", actual.getClass().getName());
  assertEquals("{getArgs=[sample, ], getOptions=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "parse", new String[]{"org.apache.commons.cli.Options", "java.lang.String[]", "java.util.Properties"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties", "<sample:8>", "<sample:0>", "<sample:1>"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.DefaultParser", "org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", new String[]{"java.lang.String"}, new String[]{"/a=/b"}, false, 0, new String[][]{{"org.apache.commons.cli.DefaultParser", "parse", "org.apache.commons.cli.Options,java.lang.String[],java.util.Properties,boolean", "<sample:4>", "<sample:2>", "<sample:8>", "false"}, {"org.apache.commons.cli.DefaultParser", "handleConcatenatedOptions", "java.lang.String", "/a/b"}});
  assertNull(actual);
 }
}
